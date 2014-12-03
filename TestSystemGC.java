
/*

Author Anish Nath
Visit the channel http://youtube.com/zarigatongy

 *java    TestSystemGC
 java -XX:+PrintCommandLineFlags -version TestSystemGC
==================Collector========================
*The Serial :
    java   -XX:+UseSerialGC TestSystemGC
===========================================
 *To enabled parallel copy collector 
 	java   -XX:+UseParNewGC TestSystemGC
 	1.Enables the parallel young generation collector
 	2.Can be used with the concurrent low pause collector.
===========================================
 *To enabled parallel Scavenge collector
 	java   -XX:+UseParallelGC TestSystemGC
 	java   -XX:+UseParallelGC -XX:-UseParallelOldGC TestSystemGC
 	[-XX:+UseParallelGC is equivalent to -XX:+UseParallelGC -XX:+UseParallelOldGC]
===========================================
* To enabled the concurrent collector 
 	java   -XX:+UseConcMarkSweepGC TestSystemGC
 	java   -XX:+UseConcMarkSweepGC -XX:+ExplicitGCInvokesConcurrent TestSystemGC
 	java   -XX:+UseConcMarkSweepGC -XX:+ExplicitGCInvokesConcurrent -XX:-UseParNewGC TestSystemGC
 	[XX:+UseConcMarkSweepGC is equivalent to -XX:+UseParNewGC -XX:+UseConcMarkSweepGC]
===========================================
* The the garbage first collector
 	java   -XX:+UseG1GC TestSystemGC
 	java   -XX:+UseG1GC -XX:+ExplicitGCInvokesConcurrent TestSystemGC
=========================================== 
 *java   -XX:+UseLargePages TestSystemGC
 *java   -XX:+UseLargePages -XX:+UseLargePagesInMetaspace TestSystemGC
 */

public class TestSystemGC {
  public static void main(String args[]) throws Exception {
    System.gc();
  }
}
