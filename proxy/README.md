### JDK和CGLib动态代理区别

- JDK是采用读取接口的信息；CGLib是覆盖父类方法；
    目的都是生成一个新的类，去实现增强代码逻辑的功能
- JDK动态代理对被代理对象而言，要求其必须有一个接口实现，目标类相对来说复杂；
    CGLib可以代理任何一个普通的类，但是不能代理类final的方法，这是一个坑
- CGLib生成代理的逻辑更复杂，生成3个文件，效率，调用效率更高，生成的FastClass包含所有的逻辑，不需要反射调用；
    JDK生成代理逻辑简单，执行效率相对要低，每次都需要反射动态调用
       
### JDK Proxy 生成对象的步骤如下：
- 1、拿到被代理对象的引用，并且获取到它的所有的接口，反射获取。
- 2、JDK Proxy 类重新生成一个新的类、同时新的类要实现被代理类所有实现的所有的接口。
- 3、动态生成 Java 代码，把新加的业务逻辑方法由一定的逻辑代码去调用（在代码中体现）。
- 4、编译新生成的 Java 代码.class。
- 5、再重新加载到 JVM 中运行。
        
### 为什么JDK动态代理中要求目标类实现的接口数量不能超过65535个？
    private static Class<?> getProxyClass0(ClassLoader loader,
                                           Class<?>... interfaces) {
        if (interfaces.length > 65535) {
            throw new IllegalArgumentException("interface limit exceeded");
        }

        // If the proxy class defined by the given loader implementing
        // the given interfaces exists, this will simply return the cached copy;
        // otherwise, it will create the proxy class via the ProxyClassFactory
        return proxyClassCache.get(loader, interfaces);
    }
   #### JDK代码里面对接口的数目做了限定，是因为JVM对接口的数目的规定决定的
   #### Class文件结构（来源于网络）
       ClassFile {
           u4                  magic;  //魔数
           u2                  minor_version;  //副版本号
           u2                  major_version;  //主版本号
           u2                  constant_pool_count;    //常量池计数器
           cp_info             constant_pool[constant_pool_count-1];   //常量池
           u2                  access_flags;   //访问标识
           u2                  this_class; //类索引
           u2                  super_class;    //父索引
           u2                  interface_count;    //接口计数器
           u2                  interfaces[interface_count];    //接口表
           u2                  fields_count;   //字段计数器
           field_info          fields[fields_count];   //字段表
           u2                  methods_count;  //方法计数器
           method_info         methods[methods_count]; //方法表
           u2                  attributes_count;   //属性计数器
           attribute_info      attributes[attributes_count];   //属性表
       }
       
   #### 里面对interface_count(接口计数器)的类型是u2，代表2个字节，所以最大为2^16-1=65535个
   
### 代理模式在Spring中的使用
   
   - 当bean有实现接口时，Spring就会使用JDK的动态代理
   - 当bean没有实现接口时，Spring就会使用CGLib的动态代理
   - Spring默认使用的是JDK动态代理，但是可以通过以下配置强制使用CGLib动态代理
   
         <aop:aspectj-autoproxy proxy-target-class="true"/>
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    