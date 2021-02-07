# SpringBootStudy01

#### SpringBoot学习项目01学习记录

###### 2021.02.07

1.阿里云镜像配置

更改IDEA安装路径下的/plugins/maven/lib/maven3/conf中的settings.xml文件，根据路径找到配置文件在mirrors标签加入如下内容：

	<mirrors>
		<mirror>
		  <id>alimaven</id>
		  <name>aliyun maven</name>
		  <url>http://maven.aliyun.com/nexus/content/groups/public/</url>
		  <mirrorOf>central</mirrorOf>
		</mirror>
	</mirrors>

**_注意不要添加在注释内_**

2.出现“No archetype found in remote catalog. Defaulting to internal catalog”报错

访问 https://repo1.maven.org/maven2/archetype-catalog.xml ，将xml文件保存至Maven的用户设置文件夹，可在设置中查询。_**加载时间可能较长，确保加载完毕后再进行保存。**_

点击Configure --> Settings，在Runner页面的VM Options添加：-DarchetypeCatalog=local，点击Apply，点击OK。

