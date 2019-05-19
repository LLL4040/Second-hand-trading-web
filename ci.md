# CI platform  

## 配置工具：

* Jenkins
* Github

## 配置过程：

### 下载并配置Jenkins

在官网上下载对应版本的jenkins，并打开localhost:8080对jenkins进行配置

#### 系统设置：

* 配置JDK、Git、Maven和Docker
* 配置Jenkins Location 和Git

#### 新建job

* 配置Github地址
![job1](https://img-blog.csdnimg.cn/20190519210727149.png)

* 配置Git
![job2](https://img-blog.csdnimg.cn/20190519210829535.png)

* 配置Git hook使得在每一次Git push的时候构建触发器
![job3](https://img-blog.csdnimg.cn/20190519210953957.png)
同时在github 对应的repo中设置钩子：
![github](https://img-blog.csdnimg.cn/20190519211635417.png)

* 配置构建操作
![job4](https://img-blog.csdnimg.cn/20190519232229395.png)

* 如果构建失败向指定目标发送邮件
![job5](https://img-blog.csdnimg.cn/20190519211502356.png)

## 使用方法

（因为使用的是内网穿透的方法，并没有在云服务器上配置CI平台，所以在每一次执行push命令之前都需要手动开启服务器端电脑上的服务（待改善））

* 访问 `http://i7k8w192e9.51http.tech` 访问到以下界面：
![user1](https://img-blog.csdnimg.cn/20190519212217185.png)

* 输入用户名和密码后进入以下界面：右侧即为job列表(其中：spring 为测试SE100/homework3/wordladder_function的job、spring-cloud1为测试second-hand-trading-web（即多人合作项目）的job）
![user2](https://img-blog.csdnimg.cn/2019051921514928.png)

* 点击对应的job可以进行对应的操作，可以修改配置，查看构建历史以及进行构建操作
![user3](https://img-blog.csdnimg.cn/20190519220429143.png)

* 每一次push之后可以到平台上查看对应的构建操作是否成功以及查看对应的控制台输出，构建失败会发送邮件给指定目标