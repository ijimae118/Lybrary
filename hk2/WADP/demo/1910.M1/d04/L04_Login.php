<!DOCTYPE html>
<!--
form dang nhap.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>login</title>
        <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-md-offset-4 col-md-4">
                    
                    <div>
                        <h2>Sign-in</h2>                       
                    </div>
                    
                    <form action="L04_Login_Process.php" 
                          method="post">
                        
                        <div class="form-group">
                            <label>Username : </label>
                            <input type="text" name="txtUser"
                                   id="txtUser" required
                                   value="aptech"
                                   class="form-control" >   
                        </div>

                        <div class="form-group">
                            <label>Password : </label>
                            <input type="password" name="txtPass"
                                   id="txtPass" required
                                   value="123"
                                   class="form-control" >   
                        </div>

                        <div>
                            <label>Remember me </label>

                            <input type="checkbox" name="chkRem"
                                   id="chkRem" 
                                   checked value="true"
                                   class="checkbox-inline" >   
                        </div>    

                        <div class="form-group">
                            <input type="submit" value="Submit" 
                                   name="btnSUB"
                                   class="btn btn-danger">
                            <input type="reset" value="Reset"
                                   class="btn btn-success">
                        </div>

                    </form>
                </div>
            </div>
        </div>        
    </body>
</html>
