swiftly
=======
#概述
> 一个简单那的定时调度框架，造的小轮子。
> 插一个题外话，现在很多人提倡说不要造轮子，对于这点。在个人觉得在表述上还是太过于笼统了。

##第一个问题：何为轮子？
------------------------
> 从概念上说，轮子是一个整体的组件，可以是汽车的，也可能是摩托车，也可能是车床的。所以这里涉及到一个粒度问题，到底轮子是何物？
简单的拿个例子来说，spring-aop算轮子吗？若是从一个AOP的处理框架来说，它就是个轮子，因为这个轮子功能单一，就是为了解决非核心业务指标的切入问题。
> 再看b2b的dubbo和facebook的Cassandra,他们算轮子，当然不算！因为它们是在一个较大的层面去解决一个大的问题。dubbo这样类似ESB总线管理调度机制设计到方方面面：安全，路由，调度，通信等等。
> 类似这样的庞大物我们应该去挑战，因为它们不可能在系统的方方面面都做到完美无缺，所以社区里面才会出现HBASE，HDSF。同样的例子还存在NOSQL领域，在现在百花齐放的年代，我们能够有幸接触到redis,mongo,memchache等优秀的轮子。

##有了轮子还需要去造吗？
------------------------
> 个人的看法是需要，很难想象在JAVA社区中有了asm之后，就不再需要javassist；有了spring aop之后就不再需要aspect，有了apache-commons之后就不再需要google-guava了。
> 社会的进步来源于创造，特别是在软件这么开放的领域，不要把自己束缚在不要造轮子的教条上，我们应该多去造轮子。
> 轮子创造美好生活！

## swiftly简介
------------------------
>还是回归正题吧，之所以写这个是因为公司内部的定时调度框架并不能满足一些自己的需求，本着求人不如求己的心态干脆自己写一个.
>会包含以下特性：
* 能够定时的调度作业	功能性需求	高     已完成
* 能够手动的启动作业	功能性需求	高
* 能够支持类名+方法名的启动方式	功能性需求	高   已完成
* 能够支持同一个作业的队列等待	非功能性需求	中
* 能够新增，修改，删除作业信息	功能性需求	中
* 能够支持shell脚本的启动方式	功能性需求	中
* 能够查看作业运行日志	功能性需求	中
* 能够查看所有的job信息	功能性需求	低
* 能够手动的停止作业	功能性需求	低
* 能够支持不同作业的权限管理	功能性需求	低
* 能够支持默认的main函数的启动方式	功能性需求	低
* 能够支持作业的中断重试机制	非功能性需求	低


##整体架构
------------------------
>物理架构上会分为控制中心及客户端,部署上也支持单机部署！
*控制中心负责所有作业的调度监控
*客户端提供资源实际的运行

##模块介绍
------------------------
*swiftly-agent 客户端的运行应用
*swiftly-api 外部使用的API
*swiftly-communication   客户端与服务端的通信包
*swiftly-core 调度的核心包
*swiftly-extend 外部扩展包
*swiftly-utils 项目的一些工具包，会被其它包依赖
*swiftly-webapp 控制中心的运行包

##主要依赖的外部包
------------------------
* spring
* javassist
* quartz
* slf4j/log4j
* apache collections/lang



