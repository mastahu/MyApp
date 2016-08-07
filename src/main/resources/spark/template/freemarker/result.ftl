


<html lang="en-us">
<head>
    <title>Balance Your Diet</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://code.getmdl.io/1.1.3/material.pink-red.min.css">
    <script defer src="https://code.getmdl.io/1.1.3/material.min.js"></script>
    <style>
        .mdl-layout {
            align-items: center;
            justify-content: center;
        }
        .mdl-layout__content {
            padding: 24px;
            flex: none;
        }
    </style>
</head>
<body>

<div class="mdl-layout mdl-js-layout mdl-color--grey-100">
    <main class="mdl-layout__content">
        <div class="mdl-card mdl-shadow--6dp">
            <div class="mdl-card__title mdl-color--primary mdl-color-text--white">
                <h2 class="mdl-card__title-text">Balance Your Diet</h2>
            </div>
            <div class="mdl-card__supporting-text">

                <b> Hello ${user.name}</b>
                <br>
                Your's BMI: ${user.bmi}
                <br>
            ${checkbmi}

                <br> USERS: ${userListAsString}

            </div>



            </form>
        </div>
    </main>
</div>


</body>
</html>