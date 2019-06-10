
<template>


        <body>
        <div class="header_bg">
            <div class="wrap">
                <div class="header">
                    <div class="logo">
                        <a href="index.html"><img src="../assets/logo.png" alt=""/> </a>
                    </div>
                    <div class="h_icon">
                        <ul class="icon1 sub-icon1">
                            <li><a class="active-icon c1" href="#" @click="login"><i>login</i></a>
                                <ul class="sub-icon1 list">
                                    <li><h3>shopping cart empty</h3><a href=""></a></li>
                                    <li><p>if items in your wishlit are missing, <a href="#">contact us</a> to view them</p></li>
                                </ul>
                            </li>
                        </ul>
                        <ul class="icon1 sub-icon1">
                            <li><a class="active-icon c1" href="#" @click="addGoods"><i>addGoods</i></a>
                                <ul class="sub-icon1 list">
                                    <li><h3>shopping cart empty</h3><a href=""></a></li>
                                    <li><p>if items in your wishlit are missing, <a href="#l">contact us</a> to view them</p></li>
                                </ul>
                            </li>
                        </ul>


                    </div>
                    <div class="h_search">
                        <form>
                            <input type="text" value="">
                            <input type="submit" value="">
                        </form>
                    </div>
                    <div class="clear"></div>
                </div>
            </div>
        </div>
        <div class="main_bg1">
            <div class="wrap">
                <div class="main1">
                    <h2>featured products</h2>
                </div>
            </div>
        </div>

        <div class="login">
            <div class="message">二手平台-登陆注册</div>
            <div id="darkbannerwrap"></div>

            <form>
                <input name="username" placeholder="用户名"  type="text" v-model="username">
                <hr class="hr15">
                <input name="password" placeholder="密码"  type="password" v-model="password">
                <hr class="hr15">
                <input value="登录" style="width:40%;" type="submit" @click="sub">
                <router-link :to="{name:'register'}"><input value="注册"  type="button" style="width:40%;"></router-link>
                <hr class="hr20">
                <!-- 帮助 <a onClick="alert('请联系管理员')">忘记密码</a> -->
            </form>


        </div>

        <!-- start footer -->
        <div class="footer_bg">
            <div class="wrap">
                <div class="footer">
                    <!-- start grids_of_4 -->
                    <div class="grids_of_4">
                        <div class="grid1_of_4">
                            <h4>featured sale</h4>
                            <ul class="f_nav">
                                <li><a href="">alexis Hudson</a></li>
                                <li><a href="">american apparel</a></li>
                                <li><a href="">ben sherman</a></li>
                                <li><a href="">big buddha</a></li>
                                <li><a href="">channel</a></li>
                                <li><a href="">christian audigier</a></li>
                                <li><a href="">coach</a></li>
                                <li><a href="">cole haan</a></li>
                            </ul>
                        </div>
                        <div class="grid1_of_4">
                            <h4>mens store</h4>
                            <ul class="f_nav">
                                <li><a href="">alexis Hudson</a></li>
                                <li><a href="">american apparel</a></li>
                                <li><a href="">ben sherman</a></li>
                                <li><a href="">big buddha</a></li>
                                <li><a href="">channel</a></li>
                                <li><a href="">christian audigier</a></li>
                                <li><a href="">coach</a></li>
                                <li><a href="">cole haan</a></li>
                            </ul>
                        </div>
                        <div class="grid1_of_4">
                            <h4>women store</h4>
                            <ul class="f_nav">
                                <li><a href="">alexis Hudson</a></li>
                                <li><a href="">american apparel</a></li>
                                <li><a href="">ben sherman</a></li>
                                <li><a href="">big buddha</a></li>
                                <li><a href="">channel</a></li>
                                <li><a href="">christian audigier</a></li>
                                <li><a href="">coach</a></li>
                                <li><a href="">cole haan</a></li>
                            </ul>
                        </div>
                        <div class="grid1_of_4">
                            <h4>quick links</h4>
                            <ul class="f_nav">
                                <li><a href="">alexis Hudson</a></li>
                                <li><a href="">american apparel</a></li>
                                <li><a href="">ben sherman</a></li>
                                <li><a href="">big buddha</a></li>
                                <li><a href="">channel</a></li>
                                <li><a href="">christian audigier</a></li>
                                <li><a href="">coach</a></li>
                                <li><a href="">cole haan</a></li>
                            </ul>
                        </div>
                        <div class="clear"></div>
                    </div>
                </div>
            </div>
        </div>
        <!-- start footer -->
        <div class="footer_bg1">
            <div class="wrap">
                <div class="footer">
                    <!-- scroll_top_btn -->

                    <a href="#" id="toTop" style="display: block;"><span id="toTopHover" style="opacity: 1;"></span></a>
                    <!--end scroll_top_btn -->
                    <div class="copy">
                        <p class="link">Copyright &copy; 2014.Company name All rights reserved.<a target="_blank" href="http://www.cssmoban.com/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a> -  More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a></p>
                    </div>
                    <div class="clear"></div>
                </div>
            </div>
        </div>

        </body>

</template>

<style scoped>
    /*@import "../mycss/login.css";*/
    body,html{
        height:100%;
        overflow:hidden;
    }
    body{
        background:url(../images/web_login_bg.jpg) no-repeat center;
        background-size: cover;
    }
    a{
        color:#3CC395;
        text-decoration:none;
        cursor:pointer;
    }
    .login{
        margin: 150px auto 0 auto;
        min-height: 420px;
        max-width: 420px;
        padding: 40px;
        background-color: #ffffff;
        margin-left: auto;
        margin-right: auto;
        border-radius: 4px;
        /* overflow-x: hidden; */
        box-sizing: border-box;
    }
    a.logo{
        display: block;
        height: 58px;
        width: 167px;
        margin: 0 auto 30px auto;
        background-size: 167px 42px;
    }
    .message {
        margin: 10px 0 0 -58px;
        padding: 18px 10px 18px 60px;
        background: #3CC395;
        position: relative;
        color: #fff;
        font-size: 16px;
    }
    #darkbannerwrap {
        background: url(../images/aiwrap.png);
        width: 18px;
        height: 10px;
        margin: 0 0 20px -58px;
        position: relative;
    }

    input[type=text],
    input[type=file],
    input[type=password],
    input[type=email], select {
        border: 1px solid #DCDEE0;
        vertical-align: middle;
        border-radius: 3px;
        height: 50px;
        padding: 0px 16px;
        font-size: 14px;
        color: #555555;
        outline:none;
        width:100%;
    }
    input[type=text]:focus,
    input[type=file]:focus,
    input[type=password]:focus,
    input[type=email]:focus, select:focus {
        border: 1px solid #27A9E3;
    }


    input[type=submit]{ display: inline-block;
        vertical-align: middle;
        padding: 12px 24px;
        margin: 0px;
        font-size: 18px;
        line-height: 36px;
        text-align: center;
        white-space: nowrap;
        vertical-align: middle;
        cursor: pointer;
        color: #ffffff;
        background-color: #3CC395;
        border-radius: 3px;
        border: none;
        -webkit-appearance: none;
        outline:none;
        width:100%;

    }
    input[type=button]{
        display: inline-block;
        vertical-align: middle;
        padding: 12px 24px;
        margin: 0px;
        font-size: 18px;
        line-height: 36px;
        text-align: center;
        white-space: nowrap;
        vertical-align: middle;
        cursor: pointer;
        color: #ffffff;
        background-color: #e48f26;
        border-radius: 3px;
        border: none;
        -webkit-appearance: none;
        outline:none;
        width:100%;
        position: relative;
        left:30px;

    }
    hr.hr15 {
        height: 15px;
        border: none;
        margin: 0px;
        padding: 0px;
        width: 100%;
    }
    hr.hr20 {
        height: 20px;
        border: none;
        margin: 0px;
        padding: 0px;
        width: 100%;
    }

    .copyright{
        font-size:14px;
        color:rgba(255,255,255,0.85);
        display:block;
        position:absolute;
        bottom:15px;
        right:15px;
    }
</style>
<script>
    export default {
        name: 'register',
        props: ['message'],
        loginsuccess: 0,
        data () {
            return {

                    username: '',
                    password: ''

            }
        },
        mounted () {
            localStorage.clear()
            localStorage.setItem('username', 'login')
            localStorage.setItem('phone', 'null')
            localStorage.setItem('email', 'null')
        },
        methods: {
            /* 提交进行判断的函数 */
            sub: function () {
                const self = this
                let url = '/my/login'
                this.$myAxios.get(url,
                    {
                        params: {
                            username: this.username,
                            password: this.password,
                        }
                    })
                    .then(function (res) {
                        var itemlist = res.data
                        self.itemList = itemlist
                        console.log(self.itemList)
                        if (res.data.loginsuccess === 1) {
                            alert('登陆成功')
                            localStorage.setItem('username', res.data.name)
                            localStorage.setItem('phone', res.data.phone)
                            localStorage.setItem('email', res.data.email)
                            console.log(res.data)
                            self.$router.push({ path: `/` })

                        }
                    })
                    .catch(err => {
                        console.log(err)
                    })
            },
        }
    }
</script>
