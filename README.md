# java_base
java to spring

//https://www.iteye.com/topic/1123081

类装载器工作机制
1.装载
    查找和导入 Class 文件
2.链接
    执行校验、准备和解析，其中解析步骤是可选择的
    （1）校验：对 Class 文件数据进行校验
    （2）准备：对类的静态变量分配内存地址
    （3）解析：将符号引用转为直接引用
3.初始化
    对类的静态变量、静态数据块执行初始化工作

