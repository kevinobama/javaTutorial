Project: JRediClients   File: PipelinedGetSetBenchmark.java   View Source Code	Vote up	6 votes
public static void main(String[] args) throws UnknownHostException, IOException {
  Jedis jedis = new Jedis(hnp.getHost(), hnp.getPort());
  jedis.connect();
  jedis.auth("foobared");
  jedis.flushAll();

  long begin = Calendar.getInstance().getTimeInMillis();

  Pipeline p = jedis.pipelined();
  for (int n = 0; n <= TOTAL_OPERATIONS; n++) {
    String key = "foo" + n;
    p.set(key, "bar" + n);
    p.get(key);
  }
  p.sync();

  long elapsed = Calendar.getInstance().getTimeInMillis() - begin;

  jedis.disconnect();

  System.out.println(((1000 * 2 * TOTAL_OPERATIONS) / elapsed) + " ops");
}
  
Example 2
Project: JRediClients   File: TransactionCommandsTest.java   View Source Code	Vote up	6 votes
@Test
public void testResetStateWithFullyExecutedTransaction() {
  Jedis jedis2 = new Jedis(jedis.getClient().getHost(), jedis.getClient().getPort());
  jedis2.auth("foobared");

  Transaction t = jedis2.multi();
  t.set("mykey", "foo");
  t.get("mykey");

  List<Object> resp = t.exec();
  assertNotNull(resp);
  assertEquals(2, resp.size());

  jedis2.resetState();
  jedis2.close();
}
  
Example 3
Project: JRediClients   File: GetSetBenchmark.java   View Source Code	Vote up	6 votes
public static void main(String[] args) throws UnknownHostException, IOException {
  Jedis jedis = new Jedis(hnp.getHost(), hnp.getPort());
  jedis.connect();
  jedis.auth("foobared");
  jedis.flushAll();

  long begin = Calendar.getInstance().getTimeInMillis();

  for (int n = 0; n <= TOTAL_OPERATIONS; n++) {
    String key = "foo" + n;
    jedis.set(key, "bar" + n);
    jedis.get(key);
  }

  long elapsed = Calendar.getInstance().getTimeInMillis() - begin;

  jedis.disconnect();

  System.out.println(((1000 * 2 * TOTAL_OPERATIONS) / elapsed) + " ops");
}
 
Example 4
Project: JRediClients   File: JedisPoolTest.java   View Source Code	Vote up	6 votes
@Test
public void checkJedisIsReusedWhenReturned() {

  JedisPool pool = new JedisPool(new JedisPoolConfig(), hnp.getHost(), hnp.getPort());
  Jedis jedis = pool.getResource();
  jedis.auth("foobared");
  jedis.set("foo", "0");
  pool.returnResource(jedis);

  jedis = pool.getResource();
  jedis.auth("foobared");
  jedis.incr("foo");
  pool.returnResource(jedis);
  pool.destroy();
  assertTrue(pool.isClosed());
}
 
Example 5
Project: JRediClients   File: JedisPoolTest.java   View Source Code	Vote up	6 votes
@Test
public void getNumActiveReturnsTheCorrectNumber() {
  JedisPool pool = new JedisPool(new JedisPoolConfig(), hnp.getHost(), hnp.getPort(), 2000);
  Jedis jedis = pool.getResource();
  jedis.auth("foobared");
  jedis.set("foo", "bar");
  assertEquals("bar", jedis.get("foo"));

  assertEquals(1, pool.getNumActive());

  Jedis jedis2 = pool.getResource();
  jedis.auth("foobared");
  jedis.set("foo", "bar");

  assertEquals(2, pool.getNumActive());

  pool.returnResource(jedis);
  assertEquals(1, pool.getNumActive());

  pool.returnResource(jedis2);

  assertEquals(0, pool.getNumActive());

  pool.destroy();
}
  
Example 6
Project: xbin-store   File: JedisClientSingle.java   View Source Code	Vote up	5 votes
private Jedis getResource() {
    Jedis resource = jedisPool.getResource();
    if (StringUtils.isBlank(password)) {
        return resource;
    } else {
        resource.auth(password);
        return resource;
    }
}
 
Example 7
Project: nighthawk   File: JaRedisFactory.java   View Source Code	Vote up	5 votes
@Override
public PooledObject<Jedis> makeObject() throws Exception {
    final HostAndPort hostAndPort = this.hostAndPort.get();
    JaRedis.Builder builder = new JaRedis.Builder();
    builder
            .host(hostAndPort.getHost())
            .port(hostAndPort.getPort())
            .connectionTimeout(connectionTimeout)
            .soTimeout(soTimeout);
    Jedis jedis = builder.build();
    try {
        jedis.connect();
        if (null != this.password) {
            jedis.auth(this.password);
        }
        if (database != 0) {
            jedis.select(database);
        }
        if (clientName != null) {
            jedis.clientSetname(clientName);
        }
    } catch (JedisException je) {
        jedis.close();
        throw je;
    }
    return new DefaultPooledObject<>(jedis);
}
 
Example 8
Project: JRediClients   File: JedisTest.java   View Source Code	Vote up	5 votes
@Test
public void startWithUrlString() {
  Jedis j = new Jedis("localhost", 6380);
  j.auth("foobared");
  j.select(2);
  j.set("foo", "bar");
  Jedis jedis = new Jedis("redis://:foobared@localhost:6380/2");
  assertEquals("PONG", jedis.ping());
  assertEquals("bar", jedis.get("foo"));
}
 
Example 9
Project: JRediClients   File: TransactionCommandsTest.java   View Source Code	Vote up	5 votes
@Before
public void setUp() throws Exception {
  super.setUp();

  nj = new Jedis(hnp.getHost(), hnp.getPort(), 500);
  nj.connect();
  nj.auth("foobared");
  nj.flushAll();
}
 
Example 10
Project: JRediClients   File: JedisTest.java   View Source Code	Vote up	5 votes
@Test
public void testBitfield() {
  Jedis jedis = new Jedis("redis://localhost:6380");
  jedis.auth("foobared");
  jedis.del("mykey");
  try {
    List<Long> responses = jedis.bitfield("mykey", "INCRBY","i5","100","1", "GET", "u4", "0");
    assertEquals(1l, responses.get(0).longValue());
    assertEquals(0l, responses.get(1).longValue());
  } finally {
    jedis.del("mykey");
  }
}
 
Example 11
Project: JRediClients   File: ClusterCommandsTest.java   View Source Code	Vote up	5 votes
@Before
public void setUp() throws Exception {

  node1 = new Jedis(nodeInfo1.getHost(), nodeInfo1.getPort());
  node1.auth("cluster");
  node1.flushAll();

  node2 = new Jedis(nodeInfo2.getHost(), nodeInfo2.getPort());
  node2.auth("cluster");
  node2.flushAll();
}
 
Example 12
Project: JRediClients   File: JedisSentinelPoolTest.java   View Source Code	Vote up	5 votes
@Test
public void checkCloseableConnections() throws Exception {
  GenericObjectPoolConfig config = new GenericObjectPoolConfig();

  JedisSentinelPool pool = new JedisSentinelPool(MASTER_NAME, sentinels, config, 1000,
      "foobared", 2);
  Jedis jedis = pool.getResource();
  jedis.auth("foobared");
  jedis.set("foo", "bar");
  assertEquals("bar", jedis.get("foo"));
  pool.returnResource(jedis);
  pool.close();
  assertTrue(pool.isClosed());
}
 
Example 13
Project: JRediClients   File: JedisTest.java   View Source Code	Vote up	5 votes
@Test
public void startWithUrl() throws URISyntaxException {
  Jedis j = new Jedis("localhost", 6380);
  j.auth("foobared");
  j.select(2);
  j.set("foo", "bar");
  Jedis jedis = new Jedis(new URI("redis://:foobared@localhost:6380/2"));
  assertEquals("PONG", jedis.ping());
  assertEquals("bar", jedis.get("foo"));
}
 
Example 14
Project: JRediClients   File: SSLJedisTest.java   View Source Code	Vote up	5 votes
/**
 * Tests opening a default SSL/TLS connection to redis.
 */
@Test
public void connectWithoutShardInfo() {
  // The "rediss" scheme instructs jedis to open a SSL/TLS connection.
  Jedis jedis = new Jedis(URI.create("rediss://localhost:6390"));
  jedis.auth("foobared");
  jedis.get("foo");
  jedis.close();
}
 
Example 15
Project: JRediClients   File: JedisTest.java   View Source Code	Vote up	5 votes
@Test(expected = JedisConnectionException.class)
public void timeoutConnection() throws Exception {
  jedis = new Jedis("localhost", 6379, 15000);
  jedis.auth("foobared");
  jedis.configSet("timeout", "1");
  Thread.sleep(2000);
  jedis.hmget("foobar", "foo");
}
 
Example 16
Project: JRediClients   File: JedisPoolTest.java   View Source Code	Vote up	5 votes
@Test(expected = JedisException.class)
public void checkPoolOverflow() {
  GenericObjectPoolConfig config = new GenericObjectPoolConfig();
  config.setMaxTotal(1);
  config.setBlockWhenExhausted(false);
  JedisPool pool = new JedisPool(config, hnp.getHost(), hnp.getPort());
  Jedis jedis = pool.getResource();
  jedis.auth("foobared");
  jedis.set("foo", "0");

  Jedis newJedis = pool.getResource();
  newJedis.auth("foobared");
  newJedis.incr("foo");
}
 
Example 17
Project: JRediClients   File: JedisPoolTest.java   View Source Code	Vote up	5 votes
@Test
public void startWithUrlString() {
  Jedis j = new Jedis("localhost", 6380);
  j.auth("foobared");
  j.select(2);
  j.set("foo", "bar");
  JedisPool pool = new JedisPool("redis://:foobared@localhost:6380/2");
  Jedis jedis = pool.getResource();
  assertEquals("PONG", jedis.ping());
  assertEquals("bar", jedis.get("foo"));
}
 
Example 18
Project: JRediClients   File: PoolBenchmark.java   View Source Code	Vote up	5 votes
public static void main(String[] args) throws Exception {
  Jedis j = new Jedis(hnp.getHost(), hnp.getPort());
  j.connect();
  j.auth("foobared");
  j.flushAll();
  j.quit();
  j.disconnect();
  long t = System.currentTimeMillis();
  // withoutPool();
  withPool();
  long elapsed = System.currentTimeMillis() - t;
  System.out.println(((1000 * 2 * TOTAL_OPERATIONS) / elapsed) + " ops");
}
 
Example 19
Project: JRediClients   File: JedisClusterTest.java   View Source Code	Vote up	4 votes
@Before
public void setUp() throws InterruptedException {
  node1 = new Jedis(nodeInfo1.getHost(), nodeInfo1.getPort());
  node1.auth("cluster");
  node1.flushAll();

  node2 = new Jedis(nodeInfo2.getHost(), nodeInfo2.getPort());
  node2.auth("cluster");
  node2.flushAll();

  node3 = new Jedis(nodeInfo3.getHost(), nodeInfo3.getPort());
  node3.auth("cluster");
  node3.flushAll();

  node4 = new Jedis(nodeInfo4.getHost(), nodeInfo4.getPort());
  node4.auth("cluster");
  node4.flushAll();

  nodeSlave2 = new Jedis(nodeInfoSlave2.getHost(), nodeInfoSlave2.getPort());
  nodeSlave2.auth("cluster");
  nodeSlave2.flushAll();
  // ---- configure cluster

  // add nodes to cluster
  node1.clusterMeet(localHost, nodeInfo2.getPort());
  node1.clusterMeet(localHost, nodeInfo3.getPort());

  // split available slots across the three nodes
  int slotsPerNode = JedisCluster.HASHSLOTS / 3;
  int[] node1Slots = new int[slotsPerNode];
  int[] node2Slots = new int[slotsPerNode + 1];
  int[] node3Slots = new int[slotsPerNode];
  for (int i = 0, slot1 = 0, slot2 = 0, slot3 = 0; i < JedisCluster.HASHSLOTS; i++) {
    if (i < slotsPerNode) {
      node1Slots[slot1++] = i;
    } else if (i > slotsPerNode * 2) {
      node3Slots[slot3++] = i;
    } else {
      node2Slots[slot2++] = i;
    }
  }

  node1.clusterAddSlots(node1Slots);
  node2.clusterAddSlots(node2Slots);
  node3.clusterAddSlots(node3Slots);

  JedisClusterTestUtil.waitForClusterReady(node1, node2, node3);
}
 
Example 20
Project: JRediClients   File: JedisTest.java   View Source Code	Vote up	4 votes
@Test
public void useWithoutConnecting() {
  Jedis jedis = new Jedis("localhost");
  jedis.auth("foobared");
  jedis.dbSize();
}
 