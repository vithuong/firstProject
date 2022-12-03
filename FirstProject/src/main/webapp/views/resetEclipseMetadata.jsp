<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>firstJsp</title>
</head>
<body>
	<h1 style="background-color: yellow;">
	eclipse bị lỗi dẫn đến việc không thể clone dữ liệu từ github <p>
	về local repository được, chỉ còn cách là xoá file metadata ở trong <p>
	workspace thì mới xoá được cài đặt ẩn bên trong eclipse và khôi phục cài đặt <p>
	trong eclipse. <p> 
	
	resetting everything eclipse <br>
	rm -rv $WORKSPACE_DIR/.metadata/ After this restart your eclipse <br>
	
	— TARGET RUNTIME for change Servers nameTomcat10(2) to Tomcat10.
	
	Github: Clone Project From Github to Local Project

Step1: Delete .metadata file in WorkSpace Folder.

		Resetting everything eclipse
		rm -rv $WORKSPACE_DIR/.metadata/ After this restart your eclipse
		Target Runtime For run Tomcat server in Project.

Step2: Clone Github to Local Repository
		with Authentication String is password commit.

Step3: Import Project From Local Repository.
		Anything Change in Code will update when we press Commit button’s list menu.
	
	</h1>
</body>
</html>