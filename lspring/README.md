——————————————maven工程——————————————————————————
1.请用eclipse import 中选择已存在的maven工程导入

2.请注意右下角进度条，此为载入jar包进度
	(未加载完成运行此程序则会报错！！
		网络畅通下1分钟内即可加载完成。^_^)
		
3.运行test中的TestFactoryBean(junit程序)。
	运行结果在最后附上
	
4.注解实现: package org.lqk.lspring.annotation;
				public @interface Component
				public @interface Autowired
				public @interface Value
bean已经放置在package org.lqk.lspring.bean;中
——————————————————————————————————————————————
最后辛苦助教在百忙中批改作业，加油！！
——————————————————————————————————————————————————
运行结果：
====confirm the out put is this junit======14301097========>
bean =================================================>
    id ==> Car
    property =================================================>
        name ==> carId
        ref ==> null
        value ==> 001
    property =================================================>
        name ==> carColor
        ref ==> null
        value ==> red
bean =================================================>
    id ==> Office
    property =================================================>
        name ==> officeId
        ref ==> null
        value ==> 824
bean =================================================>
    id ==> Boss
    property =================================================>
        name ==> office
        ref ==> Office
        value ==> null
a red car with 001
Office 824
This Boss has a red car with 001, now he is in Office 824.