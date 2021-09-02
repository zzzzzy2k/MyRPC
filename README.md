# MyRPC

[![Build Status](https://travis-ci.com/zzzzzy2k/MyRPC.svg?branch=master)](https://travis-ci.com/zzzzzy2k/MyRPC)
![GitHub](https://img.shields.io/github/license/zzzzzy2k/MyRPC)
![jdk](https://img.shields.io/static/v1?label=openjdk&message=8&color=blue)

本文参考了[一起写个Dubbo_Ziyang的博客-CSDN博客](https://blog.csdn.net/qq_40856284/category_10138756.html)

项目地址：[zzzzzy2k/MyRPC: 简单的RPC框架的实现 (github.com)](https://github.com/zzzzzy2k/MyRPC)

**概述：简单的RPC框架的实现**

首先思考RPC框架的原理。

RPC框架的原理其实很简单。
1. 客户端和服务端都可以访问到通用的接口，但是只有服务端有这个接口的实现类。
2. 客户端通过网络传输告诉服务端调用的接口是哪个。
3. 服务端收到后请求后，找到这个接口的实现类，并执行，然后将执行结果返回给客户端，作为客户端调用接口方法的返回值。

借用（抄）一下[声哥](https://github.com/CN-GuoZiyang/My-RPC-Framework)用（抄）[Guide哥](https://github.com/Snailclimb/JavaGuide)的一张图。🤪

![RPC框架思路](https://cdn.jsdelivr.net/gh/zzzzzy2k/Figurebed@main/RPC/20210902004559.png)
