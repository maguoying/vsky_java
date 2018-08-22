总结：
1.InputStreamDemo01，InputStreamDemo02、InputStreamDemo05中的byte b[] = new byte[1024]使得能读取的文件数据最大为1024
2.InputStreamDemo03、InputStreamDemo04中的byte b[] = new byte[(int)f.length()]根据文件数据大小创建读取数组