<template>
    <body>
    <div id="top">
        <h2>个人中心</h2>
        <div class=jg></div>
        <div id="topTags">
            <ul>
            </ul>
        </div>
    </div>
    <div id="main">
        <div id="leftMenu">
            <ul>
                <li @click="myinfo">个人信息</li>
                <li @click="mycoll">我的收藏</li>

            </ul>
        </div>
        <div class=jg></div>

        <div id="content">
            <div class="info" v-if="myinformation"><p>用户名：</p>{{username}}</div>
            <div class="info" v-if="myinformation"><p>电话：</p>{{phone}}</div>
            <div class="info" v-if="myinformation"><p>邮箱：</p>{{email}}</div>
            <div v-if="mycollect" class="info">
                <div>我的收藏</div>
                <!--eslint-disable-next-line-->
                <tr v-for="p in itemList">
                    <td color="#ff9955"><router-link :to="{name:'detail',params:{ id:p}}">{{"goods_id:    "+p.goods_id}}</router-link></td>

                </tr>
            </div>

        </div>

    </div>
    <div id="footer">copyrightfor865171by865171</div>
    </body>

</template>

<script>
    export default {
        name: "mycenter",
        data(){
            return {
                myinformation:true,
                mycollect:false,
                username:localStorage.getItem('username'),
                phone:localStorage.getItem('phone'),
                email:localStorage.getItem('email'),
                itemList:{},
            }
        },
        methods: {
            /* 提交进行判断的函数 */
            myinfo: function () {
                this.mycollect=false;
                this.myinformation=true;
            },
            mycoll: function () {

                this.myinformation=false;
                this.mycollect=true;
                const self = this
                let url = '/my/collect'
                this.$myAxios.get(url,
                    {
                        params: {
                            username: this.username,
                        }
                    })
                    .then(function (res) {
                        var itemlist = res.data
                        self.itemList = itemlist
                        console.log(self.itemList)

                    })
                    .catch(err => {
                        console.log(err)
                    })
            },
        },
    }
</script>

<style scoped>
    body{
        font-size:12px;
        background-image: url(../images/mcbg.gif);
        background-repeat: repeat;
    }
    ul,li,h2{margin:0;padding:0;}
    ul{list-style:none;}
    #top{
        width:909px;
        height:26px;
        background-image: url(../images/mch2bg.gif);
        margin-top: 0;
        margin-right: auto;
        margin-bottom: 0;
        margin-left: auto;
        background-repeat: repeat-x;
    }
    #top h2{
        width:150px;
        height:24px;
        float:left;
        font-size:12px;
        text-align:center;
        line-height:20px;
        color:#0066FF;
        font-weight: bold;
        padding-top: 2px;
        border-right-width: 1px;
        border-left-width: 1px;
        border-right-style: solid;
        border-left-style: solid;
        border-right-color: #99BBE8;
        border-left-color: #99BBE8;
    }
    #top .jg {
        width: 5px;
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
        border-right-width: 1px;
        border-left-width: 1px;
        border-right-style: solid;
        border-left-style: solid;
        border-right-color: #99BBE8;
        border-left-color: #99BBE8;
        padding-left: 10px;
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
        width:909px;
        height:501px;
        background-color:#F5F7E6;
        margin-top: 0;
        margin-right: auto;
        margin-bottom: 0;
        margin-left: auto;
    }
    #main .jg {
        width: 5px;
        float: left;
        background-color: #DFE8F6;
        height: 500px;
    }
    #leftMenu{
        width:150px;
        height:500px;
        background-color:#DAE7F6;
        float:left;
        border-right-width: 1px;
        border-left-width: 1px;
        border-right-style: solid;
        border-left-style: solid;
        border-right-color: #99BBE8;
        border-left-color: #99BBE8;
    }
    #leftMenu ul{margin:10px;}
    #leftMenu ul li{
        width:130px;
        height:22px;
        display:block;
        cursor:pointer;
        text-align:center;
        margin-bottom:5px;
        background-color: #D9E8FB;
        background-image: url(../images/mctabbg01.gif);
        background-repeat: no-repeat;
        background-position: 0px 0px;
        padding-top: 2px;
        line-height: 20px;
    }
    #leftMenu ul li a{
        color:#000000;
        text-decoration:none;
        background-image: url(../images/mctb-btn-sprite_03.gif);
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
        border-right-color: #99BBE8;
        border-left-color: #99BBE8;
        background-color: #DAE7F6;
    }
    .info{
        position: relative;
        line-height: 5px;
        padding:5px;
        overflow-y:auto;
        line-height:30px;
        background-color: #ffffff;
        font-family: 黑体;
        font-size: 15px;
        color: #050f0b;
    }
    .content{
        position: relative;
        z-index: -1;
        width:740px;
        height:440px;
        display:none;
        padding:5px;
        overflow-y:auto;
        line-height:30px;
        background-color: #FFFFFF;
    }
    #footer{
        width:907px;
        height:26px;
        background-color:#FFFFFF;
        line-height:20px;
        text-align:center;
        margin-top: 0;
        margin-right: auto;
        margin-bottom: 0;
        margin-left: auto;
        border-right-width: 1px;
        border-left-width: 1px;
        border-right-style: solid;
        border-left-style: solid;
        border-right-color: #99BBE8;
        border-left-color: #99BBE8;
        background-image: url(../images/mch2bg.gif);
        background-repeat: repeat-x;
    }
    .content1 {width:740px;height:490px;display:block;padding:5px;overflow-y:auto;line-height:30px;}
</style>
