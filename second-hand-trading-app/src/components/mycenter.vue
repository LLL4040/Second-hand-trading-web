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
    <div id="mcbiao">

    <div id="main">
        <div id="top">
            <h2>个人中心</h2>
        </div>
        <div id="leftMenu">
            <ul>
                <li @click="myinfo()">个人信息</li>
                <li @click="mycoll()">我的收藏</li>

            </ul>
        </div>
        <div class=jg></div>

        <div id="content">
            <div class="info" v-if="myinformation !== 'false'"><p>用户名：</p>{{username}}</div>
            <div class="info" v-if="myinformation !== 'false'"><p>电话：</p>{{phone}}</div>
            <div class="info" v-if="myinformation !== 'false'"><p>邮箱：</p>{{email}}</div>
            <div v-if="mycollect !== 'false'" class="info">
                <div>我的收藏</div>
                <!--eslint-disable-next-line-->
                <tr v-for="p in itemList">
                    <td>{{p.goods_id}}</td>
                    <td color="#ff9955"><router-link :to="{name:'detail',params:{ id:p}}">{{"goods_id:    "+p.goods_id}}</router-link></td>

                </tr>
            </div>

        </div>
</div>
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
                <div class="clear"></div>
            </div>
        </div>
    </div>

    </body>

</template>

<script>
    export default {
        name: "mycenter",
        data(){
            return {
                myinformation:'true',
                mycollect:'false',
                username:localStorage.getItem('username'),
                phone:localStorage.getItem('phone'),
                email:localStorage.getItem('email'),
                itemList:{},
            }
        },
        methods: {
            /* 提交进行判断的函数 */
            myinfo() {
                this.mycollect='false';
                this.myinformation='true';
                this.$forceUpdate();
            },
            mycoll() {
                this.myinformation='false';
                this.mycollect='true';
                const self = this;
                let url = 'collect-server/my/collect';
                this.$myAxios.get(url,
                    {
                        params: {
                            username: this.username,
                        }
                    })
                    .then(function (res) {
                        var itemlist = res.data;
                        self.itemList = itemlist;
                        console.log(self.itemList);
                        console.log(typeof self.mycollect);
                        self.$forceUpdate();
                    })
                    .catch(err => {
                        console.log(err)
                    })
            },
        },
    }
</script>

<style scoped>
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



     ul,li,h2{margin:0;padding:0;}
    ul{list-style:none;}
    #top{
        text-align: center;
        width:904px;
        height:40px;

        margin-right: 0px;
        margin-bottom: 0;
        margin-left: 0px;
        background-repeat: repeat-x;
        background: #43d6c8;
    }
    #top h2{
        position: center;
        width:150px;
        height:24px;
        float:left;
        font-size:24px;
        text-align:center;
        line-height:30px;
        color: #fff9f6;
        font-weight: bold;
        padding-top: 2px;

    }
    #top .jg {
        width: 0px;
        float: left;
        background-color: #DCE6F5;
        height: 26px;
    }
    #topTags{
        width:740px;
        height:24px;
        float:left;
        margin-top: 0;
        margin-right: auto;
        margin-bottom: 0;
        margin-left: auto;
        padding-top: 2px;
    }
    #topTags ul li{
        float:left;
        width:100px;
        height:21px;
        margin-right:4px;
        display:block;
        text-align:center;
        cursor:pointer;
        padding-top: 3px;
        color: #15428B;
        font-size: 12px;
    }
    #main{
        width:904px;
        height:501px;
        background-color:#F5F7E6;
        margin-top: 0;
        margin-right: auto;
        margin-bottom: 40px;
        margin-left: auto;
    }

    #leftMenu{
        color: #f8f8f8;
        width:150px;
        height:500px;
        background-color: #c4e8e3;
        float:left;
        border-right-width: 1px;
        border-left-width: 1px;
        border-right-style: solid;
        border-left-style: solid;
        border-right-color:#c4e8e3;
        border-left-color: #e8e6e1;
    }
    #leftMenu ul{margin:10px;}
    #leftMenu ul li{
        width:130px;
        height:22px;
        display:block;
        cursor:pointer;
        text-align:center;
        margin-bottom:5px;
        background-color: #42d4c6;

        background-repeat: no-repeat;
        background-position: 0px 0px;
        padding-top: 2px;
        line-height: 20px;
    }
    #leftMenu ul li a{
        color: #ffffff;
        text-decoration:none;
        background-repeat: repeat-x;
    }
    #content{
        width:750px;
        height:500px;
        float:left;
        border-right-width: 1px;
        border-left-width: 1px;
        border-right-style: solid;
        border-left-style: solid;
        border-right-color: #5a994b;
        border-left-color: #5a994b;
        background-color: #c4e8e3;
    }
    .info{
        position: relative;
        line-height: 5px;
        padding:5px;
        overflow-y:auto;
        line-height:30px;
        background-color: #ffffff;
        font-size: 15px;
        color: #5e5e5e;
    }
    #mcbiao{
        position: static;
    }





</style>
