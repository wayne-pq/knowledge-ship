[CAP理论](https://en.wikipedia.org/wiki/CAP_theorem)：

- Consistency（一致性）  
  Every read receives the most recent write or an error.  
  每次读数据，要么就一定是最新的，要么出错。
-
    - Partition tolerance（分区容忍性） The system continues to operate despite an arbitrary number of messages being dropped (
      or delayed) by the network between nodes. When a network partition failure happens, it must be decided whether to
        - cancel the operation and thus decrease the availability but ensure consistency or to
        - proceed with the operation and thus provide availability but risk inconsistency.

如果因为网络问题导致节点通讯失败，以至于任意消息丢失，系统仍会提供服务，所以分区容忍性是对客户端的一种承诺，我会一直运行。但当这种情况发生时，系统必须决定：
    - 要么取消操作，以降低可用性当时保证一致性。
    - 要么允许操作，以增加可用性但是影响一致性。

Thus, if there is a network partition, one has to choose between consistency and availability.  
所以，一个系统发生网络分区（因为网络问题导致数据不同步），必须在可用性和一致性中二选一。