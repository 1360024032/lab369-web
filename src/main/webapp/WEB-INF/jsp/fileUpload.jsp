<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Lab369 FPGA异构集群</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles/style.css">
<!-- <link rel="stylesheet" type="text/css" href="<c:url value='/styles/css/style.css'/>"> -->
<meta charset="utf-8">
</head>
<body>
    <div id="menu"  class="menu clearfix">
        <div class="cluster-con">
            <form:form method="POST" action="/Lab369/addfileUploadPage"
                enctype="multipart/form-data" >
               <table class="tabledata">
                <h2 >提交计算数据</h2>
                <th colspan="2" >矩阵乘法</th>
                <tr>

                    <td >
                      请选择数据文件:&nbsp; &nbsp; &nbsp; &nbsp; 
                     <input type="file" class="dataInput" name="file1" multiple="multiple"  />

                    </td>
                </tr>
                 <tr>
                    <td>
                      请选择任务描述文件: 
                     <input type="file" class="dataInput" name="file2" multiple="multiple"/>

                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="right">
                    <input class=" vecontrolButton active" type="submit" value="提交上传" />
                    </td>
                </tr>
              </table>
              
            </form:form>

            <form:form method="POST" action="/Lab369/addfileUploadPage"
                enctype="multipart/form-data" >
               <table class="tabledata">
            
                <th colspan="2">VGG16</th>
                <tr>

                    <td>
                      请选择数据文件:&nbsp; &nbsp; &nbsp; &nbsp; 
                     <input type="file" class="dataInput" name="file1" multiple="multiple" />

                    </td>
                </tr>
                 <tr>
                    <td>
                      请选择任务描述文件: 
                     <input type="file" class="dataInput" name="file2" multiple="multiple"/>

                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="right">
                    <input class=" vecontrolButton active" type="submit" value="提交上传" />
                    </td>
                </tr>
              </table>
              
            </form:form>

            <form:form method="POST" action="/Lab369/addfileUploadPage"
                enctype="multipart/form-data" >
               <table class="tabledata">
               
                <th colspan="2">SqueezeNet</th>
                <tr>

                    <td>
                      请选择数据文件:&nbsp; &nbsp; &nbsp; &nbsp; 
                     <input type="file" class="dataInput" name="file1" multiple="multiple" />

                    </td>
                </tr>
                 <tr>
                    <td>
                      请选择任务描述文件: 
                     <input type="file" class="dataInput" name="file2" multiple="multiple"/>

                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="right">
                    <input class=" vecontrolButton active" type="submit" value="提交上传" />
                    </td>
                </tr>
              </table>
              
            </form:form>
            <h2>FPGA选择执行命令 </h2>
             <form:form method="POST" action="/Lab369/Fpgaselcet" enctype="multipart/form-data">
     
               <table  class="tabledata">
                  
                 <tr>
                   <td colspan="2"  align="left" > 
                 <input type="submit" class="vecontrolButton active"  value="选择一块FPGA" />
                      </td>
                      
                    </tr>
                 </table>
               </form:form>
        
                <form:form method="POST" action="/Lab369/Fpgaselcet1" enctype="multipart/form-data">
    
               <table  class="tabledata">
           
                 <tr>
                      <td colspan="2"  align="right" > 
                 <input type="submit"  class="vecontrolButton active" value="选择8块FPGA" />
                      </td>
                    </tr>
                 </table>
               </form:form>
           
                  
        </div>

  </div>
   



</body>
</html>