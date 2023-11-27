<html>

    <head>
        <style>

            *{
                margin: 0;
                padding: 0;
                font-family: 'Times New Roman', Times, serif;
            }

            :root{
                --navbar-height: 59px;
            }

            #navbar{
                position: absolute;
                display: flex;
                align-items: center;
                top: 0%;
            }
            option,#navbar ul{
                display: flex;
            }
            option,#navbar ul li{
                list-style: none;
                font-size: 1.3rem;
            }

            option,#navbar ul li a{
                color: rgb(38, 29, 31);
                display: block;
                padding: 2px 12px;
                border-radius: 5px;
                text-decoration: none;
            }
            #navbar ul li a:hover{
                color:rgb(53, 68, 72);
                background-color: rgb(144, 242, 243);
            }
            #home{
                display: flex;
                flex-direction: column;
                padding: 40px 200px;
                height: 500px;
                justify-content: center;
                align-items: center;
            }
            #home::before{
                content: "";
                position: absolute;
                background: linear-gradient(130deg, rgb(72, 174, 242), white);
                height: 100%;
                width: 100%;
                top: 0px;
                left: 0px;
                z-index: -1;
            }
            #home h1{
                color: rgb(32,54,76);
                text-align: center;
            }
            #logo{
                margin: 15px 23px;
            }
            #logo img{
                height: 100px;
                margin: 2px 4px;
            }

            /* --------------------------------------------------------------- */


            /* Dropdown button */
            .dropdown .dropbtn {
                font-size: 1.3rem;
                border: none;

                padding: 2px 12px;
                border-radius: 5px;

                background-color: inherit;

            }

            /* Add a red background color to navbar links on hover */
            .navbar a:hover, .dropdown:hover .dropbtn {

                background-color: rgb(144, 242, 243);

            }

            /* Dropdown content (hidden by default) */
            .dropdown-content {
                display: none;
                position: absolute;
                border-color: black;
                /* background-color: #f9f9f9; */
                /* min-width: 160px; */
                /* box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2); */
                z-index: 1;
            }

            /* Links inside the dropdown */
            .dropdown-content a {
                /* float: none; */
                color: black;
                padding: 12px 16px;
                text-decoration: none;
                display: block;
                text-align: left;
                width: 200px;
            }

            /* Add a grey background color to dropdown links on hover */
            /*            .dropdown-content a:hover {
                             background-color: #ddd; 
                             width: 200px;
                        }*/

            /* Show the dropdown menu on hover */
            .dropdown:hover .dropdown-content {
                display: grid;
            }






            .container {
                max-width: 800px;
                margin: 0 auto;
                padding: 20px;
                background-color: #ffffff;
                border-radius: 5px;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            }

            .services {
                padding: 40px 0;
                text-align: center;
            }

            .services h2 {
                color: #0066cc;
            }

            .services-list {
                list-style: none;
                padding: 0;
                margin-top: 20px;
            }

            .services-list li {
                display: inline-block;
                width: 150px;
                margin: 10px;
                text-align: center;
            }

            .services-list img {
                width: 60px;
                height: 60px;
                margin-bottom: 10px;
            }

            .services-list span {
                display: block;
                color: #333333;
            }
            

        </style>
    </head>

    <body>

    <nav id="navbar">
        <div id="logo" >
            <img src="logo3.png" alt="">
        </div>

        <ul>
            <li class="item"><a href="home.jsp">HOME</a></li>
            <li class="item">
                <a href="Login.jsp">Login</a>
            </li>
            <li class="item"><a href="INFO.jsp">About us</a></li>
            <li class="item"><a href="">Contact us</a></li>

            <li class="item">
                <div class="dropdown" >
                    <button class="dropbtn">ADDRESS</button>
                    <div class="dropdown-content">

                        <a width="800px">Global Square, Patan Bypass, Raigwan, Jabalpur, Madhya Pradesh 482002</a>
                        <a href="https://goo.gl/maps/FXVxSXDbzxotE1466">	<i class="fas fa-band-aid"></i> Direction</a>
                    </div>
                </div>

            </li>
        </ul>

    </nav>
    <section id="home">
        <h1 class="h-primary" style="translation-value: right">Welcome to GlobalBanking</h1>
    </section>


    <section class="services">
        <div class="container">
            <h2>Our Services</h2>
            <ul class="services-list">
                <li>
                    <img src="https://cdn0.iconfinder.com/data/icons/human-resources-29/66/13-512.png" alt="Account Management">
                <span>Account Management</span>
                </li>
                <li>
                    <img src="https://th.bing.com/th/id/OIP.sFqZ4mVNc0nZ4MDev9m2iQHaHa?pid=ImgDet&rs=1" alt="Online Banking">
                <span>Online Banking</span>
                </li>
                <li>
                    <img src="https://th.bing.com/th/id/R.1c9c6e724d0c4da6a2abafc118a814be?rik=z%2fc%2fEE4DEJR2IA&riu=http%3a%2f%2fcdn.onlinewebfonts.com%2fsvg%2fimg_462273.png&ehk=8BJAQPXpsaaz0VuSGQNbK88YdFvzxJyuliUBO139yY4%3d&risl=&pid=ImgRaw&r=0" alt="Loans and Mortgages">
                <span>Loans and Mortgages</span>
                </li>
                <li>
                    <img src="https://th.bing.com/th/id/OIP.N9lNK6w07czR8wRLuwTOCgHaHk?pid=ImgDet&rs=1" alt="Credit Cards">
                <span>Credit Cards</span>
                </li>
                <li>
                    <img src="https://cdn0.iconfinder.com/data/icons/fintech-element-6/64/personal-wealth-management-investment-accountant-1024.png" alt="Investment Services">
                <span>Investment Services</span>
                </li>
            </ul>
        </div>
    </section>

</body>

</html>