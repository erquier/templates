<!DOCTYPE html>
<html>
	<head>
		<title>${titulo! "Titulo por defecto"}</title>
	</head>
	<body>
		<#if user??>
		
			<h1> ${user.getNombre()} ${user.getApellido()}</h1>
			
			<#else>
			
			<h3>el usuario no existe</h3>
			
		</#if>
		

	</body>
	</html>