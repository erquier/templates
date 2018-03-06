<body>
        <h2>${Contacto! "Formulario de contacto"}</h2>

        <@spring.bind "user"/>
        <#if user?? && noErrors??>
            Your data has been sent<br>
            Name: ${user.name}<br>
            Email: ${user.email}<br>
            Message: ${user.message}<br>
        <#else>
            <form action="/contacto" method="post">
                Name:<br>
                <@spring.formInput "user.name"/>
                <@spring.showErrors "<br>"/>
                <br><br>
                Email:<br>
                <@spring.formInput "user.email"/>
                <@spring.showErrors "<br>"/>
                <br><br>
                Message:<br>
                <@spring.formTextarea "user.message"/>
                <@spring.showErrors "<br>"/>
                <br><br>
                
            </form>
        </#if>


    </body>