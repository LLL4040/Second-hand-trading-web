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
                        <li><a class="active-icon c1" href="#" @click="login"><i>{{message}}</i></a>

                            <ul class="sub-icon1 list" >
                                <router-link router-link :to="{name:'mycenter'}" ><li><h3>个人中心</h3></li></router-link>
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
    <!-- start main1 -->
    <div class="main_bg1">
        <div class="wrap">
            <div class="main1">
                <h2>添加商品</h2>
            </div>
        </div>
    </div>
    <!-- start main -->
    <div class="main_bg">
        <div class="wrap">
    <div class="main">
        <div class="contact">
            <div class="contact-form">
                <h2>商品信息</h2>

                    <div>
                        <span><label>封面</label></span>
                        <span><input type='file' accept="image/*" id="file" ref="file"></span>
                    </div>
                    <div>
                        <span><label>商品名</label></span>
                        <span><input type="text" class="textbox" v-model="title"></span>
                    </div>
                    <div>
                        <span><label>详细描述</label></span>
                        <span><input type="text" class="textbox" v-model="detail"></span>
                    </div>
                    <div>
                        <span><label>联系方式</label></span>
                        <span><input name="userPhone" type="text" class="textbox" v-model="contact"></span>
                    </div>
                    <div>
                        <span><input type="submit" @click="addGoods()" class="" value="添加商品"></span>
                    </div>

            </div>
            <div class="clear"></div>
        </div>
    </div>
        </div>
    </div>
    </body>
</template>

<script>
    export default {
        name: "addGoods",
        data(){
            return {
                goods_id: 0,
                contact:"",
                cover:"",
                detail:"",
                status:"",
                title:"",
                seller:"",
                message:this.GLOBAL.username,
            }
        },
        mounted(){
            if(this.GLOBAL.username==="" || this.GLOBAL.username==="login"){
                this.$alert("未登录请先登录");
                this.$router.push({ path: `/login` });
            }
        },
        methods:{
            addGoods(){
                if(this.GLOBAL.username==="" || this.GLOBAL.username==="login"){
                    this.$alert("未登录请先登录");
                    this.$router.push({ path: `/login` });
                }
                let imagFile = this.$refs.file.files[0];
                let bodyFormData = new FormData();
                bodyFormData.set('username', this.GLOBAL.username);
                bodyFormData.set('title', this.title);
                bodyFormData.set('detail', this.detail);
                bodyFormData.set('contact', this.contact);
                bodyFormData.set('status', 1);
                bodyFormData.append('cover',imagFile);
                this.$myAxios({method: 'post',
                    url: '/goods-server/goods/saveGoods',
                    data: bodyFormData,
                    config: { headers: {'Content-Type': 'multipart/form-data' }}}
                )
                    .then(function (response) {
                        console.log(response);
                        if(response.data){alert("添加商品成功");}
                    })
                    .catch(function (error) {
                        console.log(error);
                    })
                    .then(function () {
                        //always executed
                    });
            }
        }
    }

</script>

<style scoped>

</style>
