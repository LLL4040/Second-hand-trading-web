<template>
    <body>
    <!-- start header -->
    <div class="header_bg">
        <div class="wrap">
            <div class="header">
                <div class="logo">
                    <a href="index.html"><img src="../assets/logo.png" alt=""/> </a>
                </div>
                <div class="h_icon">
                    <ul class="icon1 sub-icon1">
                        <li><a class="active-icon c1" href="#" @click="login"><i>{{message}}</i></a>
                            <ul class="sub-icon1 list">
                                <li><h3>shopping cart empty</h3><a href=""></a></li>
                                <li><p>if items in your wishlit are missing, <a href="#">contact us</a> to view them</p></li>
                            </ul>
                        </li>
                    </ul>
                    <ul class="icon1 sub-icon1">
                        <li><a class="active-icon c1" href="#" @click="addGoods"><i>addGoods</i></a>
                            <ul class="sub-icon1 list">
                                <li><h3>发布新商品</h3><a href=""></a></li>
                                <!--<li><p>if items in your wishlit are missing, <a href="#l">contact us</a> to view them</p></li>-->
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
    <!-- start main -->
    <div class="main_bg">
        <div class="wrap">
            <div class="main">
                <!-- start content -->
                <div class="single">
                    <!-- start span1_of_1 -->
                    <div class="left_content">
                        <div class="span1_of_1">
                            <!-- start product_slider -->
                            <div class="product-view">
                                <div class="product-essential">
                                    <div class="product-img-box">
                                        <div class="more-views" style="float:left;">
                                            <div class="more-views-container">
                                                <ul>
                                                    <li>
                                                        <a class="cs-fancybox-thumbs" data-fancybox-group="thumb" style="width:64px;height:85px;" href=""  title="" alt="">
                                                            <img src="" src_main=""  title="" alt="" /></a>
                                                    </li>
                                                    <li>
                                                        <a class="cs-fancybox-thumbs" data-fancybox-group="thumb" style="width:64px;height:85px;" href=""  title="" alt="">
                                                            <img src="" src_main=""  title="" alt="" /></a>
                                                    </li>
                                                    <li>
                                                        <a class="cs-fancybox-thumbs" data-fancybox-group="thumb" style="width:64px;height:85px;" href=""  title="" alt="">
                                                            <img src="" src_main=""  title="" alt="" /></a>
                                                    </li>
                                                    <li>
                                                        <a class="cs-fancybox-thumbs" data-fancybox-group="thumb" style="width:64px;height:85px;" href=""  title="" alt="">
                                                            <img src="" src_main="" title="" alt="" /></a>
                                                    </li>
                                                    <li>
                                                        <a class="cs-fancybox-thumbs" data-fancybox-group="thumb" style="width:64px;height:85px;" href=""  title="" alt="">
                                                            <img src="" src_main="" title="" alt="" /></a>
                                                    </li>
                                                </ul>
                                            </div>
                                        </div>
                                        <!--商品图片显示在这里-->
                                        <div class="product-image">
                                            <a class="cs-fancybox-thumbs cloud-zoom" rel="adjustX:30,adjustY:0,position:'right',tint:'#202020',tintOpacity:0.5,smoothMove:2,showTitle:true,titleOpacity:0.5" data-fancybox-group="thumb" title="Women Shorts" alt="Women Shorts">
                                                <img :src=cover />
                                            </a>
                                        </div>

                                    </div>
                                </div>
                            </div>
                            <!-- end product_slider -->
                        </div>
                        <!-- start span1_of_1 -->
                        <div class="span1_of_1_des">
                            <div class="desc1">
<!--                                商品信息显示在这里-->
                                <h3>商品名字：{{title}} </h3>
                                <div class="available">
                                    <h4>商家名字：{{seller}}</h4>
                                    <h4>联系方式：{{contact}}</h4>
                                    <div class="btn_form" @click="followUser(seller)">
                                        <form>
                                            <input type="addComment" value="follow the user"/>
                                        </form>
                                    </div>
                                    <div class="clear"></div>

                                    <div class="btn_form" @click="collect(goods_id)">
                                        <form>
                                            <input type="addComment" value="add to collect"/>
                                        </form>
                                    </div>
                                    <div class="clear"></div>
                                    <div class="btn_form" @click="changedialogVisible">
                                        <form>
                                            <input type="addComment" value="add  comment"/>
                                        </form>
                                    </div>
<!--                                    这是增加评价的内容-->
                                    <el-dialog
                                            title="增加评价"
                                            :visible.sync="dialogVisible"
                                            width="30%"
                                    >
                                        <el-row>
                                            <el-col>
                                        <el-row><el-col><h3>{{title}}</h3></el-col></el-row>
                                            </el-col>
                                            <el-col>
                                               <el-row>
                                                   <el-input
                                                           type="textarea"
                                                           :rows="2"
                                                           placeholder="请输入内容"
                                                           v-model="commentarea">
                                                   </el-input>
                                               </el-row>
                                            </el-col>
                                        </el-row>



                                        <span slot="footer" class="dialog-footer">

                                        <el-button-group>
                                        <el-button @click="dialogVisible = false">取 消</el-button>
                                        <el-button type="danger" @click="addComment(seller)">确 定</el-button>
                                         </el-button-group>
                                        </span>
                                    </el-dialog>
<!--                                    <span class="span_right"><a href="#">login to save in wishlist </a></span>-->
                                    <div class="btn_form" @click="deleteGoods(goods_id)" v-if="message==seller">
                                        <form>
                                            <input type="addComment" value="Delete the Goods"/>
                                        </form>
                                    </div>

                                </div>
<!--                                <div class="span_right"></div>-->
                            </div>
                        </div>
                        <div class="clear"></div>
                        <section class="tabs">
                            <input id="tab-1" type="radio" name="radio-set" class="tab-selector-1" checked="checked">
                            <label for="tab-1" class="tab-label-1">商品详情</label>

                            <input id="tab-2" type="radio" name="radio-set" class="tab-selector-2">
                            <label for="tab-2" class="tab-label-2">商家评论</label>

                            <div class="clear-shadow"></div>

                            <div class="content">
                                <div class="content-1">
                                    <ul>
                                        <li>{{detail}}</li>
                                    </ul>
                                    <div class="clear"></div>
                                </div>
                                <div class="content-2">
                                    <ul class="qua_nav" v-for="obj in commentData" :key="obj">
                                        <li>{{obj["username"]}}:{{obj["comment"]}}</li>
                                    </ul>
                                </div>
                            </div>
                        </section>
                        <!-- end tabs -->
                    </div>
                    <!-- start sidebar -->
                    <div class="left_sidebar">
                        <div class="sellers">
                            <h4>Best Sellers</h4>
                            <div class="single-nav">
                                <ul>
                                    <li><a href="#">Always free from repetition</a></li>
                                    <li><a href="#">Always free from repetition</a></li>
                                    <li><a href="#">The standard chunk of Lorem Ipsum</a></li>
                                    <li><a href="#">The standard chunk of Lorem Ipsum</a></li>
                                    <li><a href="#">Always free from repetition</a></li>
                                    <li><a href="#">The standard chunk of Lorem Ipsum</a></li>
                                    <li><a href="#">Always free from repetition</a></li>
                                    <li><a href="#">Always free from repetition</a></li>
                                    <li><a href="#">Always free from repetition</a></li>
                                    <li><a href="#">The standard chunk of Lorem Ipsum</a></li>
                                    <li><a href="#">Always free from repetition</a></li>
                                    <li><a href="#">Always free from repetition</a></li>
                                    <li><a href="#">Always free from repetition</a></li>
                                </ul>
                            </div>
                            <div class="banner-wrap bottom_banner color_link">
                                <a href="#" class="main_link">
                                    <figure><img src="../assets/delivery.png" alt=""></figure>
                                    <h5><span>Free Shipping</span><br> on orders over $99.</h5><p>This offer is valid on all our store items.</p></a>
                            </div>
                            <div class="brands">
                                <h1>Brands</h1>
                                <div class="field">
                                    <select class="select1">
                                        <option>Please Select</option>
                                        <option>Lorem ipsum dolor sit amet</option>
                                        <option>Lorem ipsum dolor sit amet</option>
                                        <option>Lorem ipsum dolor sit amet</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- end sidebar -->
                    <div class="clear"></div>
                </div>
                <!-- end content -->
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
                            <li><a href="#">alexis Hudson</a></li>
                            <li><a href="#">american apparel</a></li>
                            <li><a href="#">ben sherman</a></li>
                            <li><a href="#">big buddha</a></li>
                            <li><a href="#">channel</a></li>
                            <li><a href="#">christian audigier</a></li>
                            <li><a href="#">coach</a></li>
                            <li><a href="#">cole haan</a></li>
                        </ul>
                    </div>
                    <div class="grid1_of_4">
                        <h4>mens store</h4>
                        <ul class="f_nav">
                            <li><a href="#">alexis Hudson</a></li>
                            <li><a href="#">american apparel</a></li>
                            <li><a href="#">ben sherman</a></li>
                            <li><a href="#">big buddha</a></li>
                            <li><a href="#">channel</a></li>
                            <li><a href="#">christian audigier</a></li>
                            <li><a href="#">coach</a></li>
                            <li><a href="#">cole haan</a></li>
                        </ul>
                    </div>
                    <div class="grid1_of_4">
                        <h4>women store</h4>
                        <ul class="f_nav">
                            <li><a href="#">alexis Hudson</a></li>
                            <li><a href="#">american apparel</a></li>
                            <li><a href="#">ben sherman</a></li>
                            <li><a href="#">big buddha</a></li>
                            <li><a href="#">channel</a></li>
                            <li><a href="#">christian audigier</a></li>
                            <li><a href="#">coach</a></li>
                            <li><a href="#">cole haan</a></li>
                        </ul>
                    </div>
                    <div class="grid1_of_4">
                        <h4>quick links</h4>
                        <ul class="f_nav">
                            <li><a href="#">alexis Hudson</a></li>
                            <li><a href="#">american apparel</a></li>
                            <li><a href="#">ben sherman</a></li>
                            <li><a href="#">big buddha</a></li>
                            <li><a href="#">channel</a></li>
                            <li><a href="#">christian audigier</a></li>
                            <li><a href="#">coach</a></li>
                            <li><a href="#">cole haan</a></li>
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

<script>
    export default {
        name: "detail",
        data () {
            return {
                commentData:[],
                goodsData:[],

                goods_id: 0,
                contact:"",
                cover:"",
                detail:"",
                status:"",
                title:"",
                username:"",
                seller:"",
                dialogVisible: false,
                commentarea:"",
                message:this.GLOBAL.username,


            }
        },
        mounted(){
            this.initGoods();

        },
        methods:{

            login(){
                this.$router.push({ path: `/login` });
            },
            addGoods(){
                this.$router.push({ path: `/addGoods` });
            },
            changedialogVisible(){
                if(this.dialogVisible==1){
                    this.dialogVisible=0;
                }else {
                    this.dialogVisible=1;
                }
            },
            initGoods(){
                console.log("sss"+this.GLOBAL.goods_id);
                var that = this;
                that.$myAxios.get('goods-server/goods/findGoodsById',{
                    params:{
                        goods_id:that.GLOBAL.goods_id,

                    }
                })
                    .then(function (response) {
                        // console.log(response);
                        that.goods_id=response.data.goods_id;
                        that.contact=response.data.contact;
                        that.cover= "data:image/png;base64," + response.data.cover;
                        that.detail = response.data.detail;
                        that.status=response.data.status;
                        that.title=response.data.title;
                        that.seller=response.data.username;
                        console.log(response.data.title);


                    })
                    .catch(function (error) {
                        console.log(error);
                    })
                    .then(function () {
                        //always executed
                        //that.loadComment(that.seller);
                        that.$options.methods.loadComment.bind(that)();
                        //that.$forceUpdate();//强制刷新
                    })
            },
            addComment(seller){
                this.changedialogVisible();
                var that = this;
                var bodyFormData = new FormData();
                bodyFormData.set('username', this.GLOBAL.username);
                bodyFormData.set('seller', seller);
                bodyFormData.set('comment', this.commentarea);
                that.$myAxios({method: 'post',
                    url: '/comment-server/comment/saveComment',
                    data: bodyFormData,
                    config: { headers: {'Content-Type': 'multipart/form-data' }}}
                )
                    .then(function (response) {
                        console.log(response);
                        if(response.data){alert("评论商家成功");}
                    })
                    .catch(function (error) {
                        console.log(error);
                    })
                    .then(function () {
                        //always executed
                    });
                this.loadComment();
            },
            //这里seller指的是商家的名字
            followUser(seller){
                if(this.GLOBAL.username==="login"){
                    this.$alert("未登录请先登录");
                    this.$router.push({ path: `/login` });
                }
                let bodyFormData = new FormData();
                bodyFormData.set('username', this.GLOBAL.username);
                bodyFormData.set('seller', seller);
                this.$myAxios(
                    {
                        method: 'post',
                        url: '/follow-server/my/saveFollow',
                        data: bodyFormData,
                        config: { headers: {'Content-Type': 'multipart/form-data' }}
                    }
                )
                    .then(function (response) {
                        console.log(response);
                        if(response.data){alert("关注商家成功");}
                    })
                    .catch(function (error) {
                        console.log(error);
                    })
                    .then(function () {
                        //always executed
                    })
            },
            collect(goods_id){
                if(this.GLOBAL.username==="login"){
                    this.$alert("未登录请先登录");
                    this.$router.push({ path: `/login` });
                }
                let bodyFormData = new FormData();
                bodyFormData.set('username', this.GLOBAL.username);
                bodyFormData.set('goods_id', goods_id);
                this.$myAxios(
                    {
                        method: 'post',
                        url: '/collect-server/my/addCollect',
                        data: bodyFormData,
                        config: { headers: {'Content-Type': 'multipart/form-data' }}
                    }
                )
                    .then(function (response) {
                        console.log(response);
                        if(response.data){alert("收藏商品成功");}
                    })
                    .catch(function (error) {
                        console.log(error);
                    })
                    .then(function () {
                        //always executed
                    })
            },
            deleteGoods(goods_id){
                console.log(goods_id);
                this.$myAxios.get('/goods/delectGoodsById',{
                    params:{
                        goods_id:goods_id,

                    }
                })
                    .then(function (response) {
                        console.log(response);
                        if(response.data=="delete goods success"){alert("删除商品成功");}
                    })
                    .catch(function (error) {
                        console.log(error);
                    })
                    .then(function () {
                        //always executed
                        this.$router.push({ path: `/` });


                    })
            },
            loadComment(){

                var that= this;
                this.$myAxios.get('/comment-server/comment/findAllBySeller',{
                    params:{
                        seller:this.seller
                    }
                })
                    .then(function (response)  {

                        console.log(response);
                        for(var i=0;i<response.data.length;i++){
                            var objproject = {
                                "comment_id" : response.data[i].comment_id,
                                "username" : response.data[i].username,
                                "seller" : response.data[i].seller,
                                "comment" : response.data[i].comment,
                                //"comments_id" :response.data[i].comments_id,
                            }
                            that.commentData.push(objproject);
                            console.log(that.commentData[i]);

                            console.log(that.commentData[i].comment);

                        }
                        this.$forceUpdate();//强制刷新
                    })
                    .catch(function (error) {
                        console.log(error);
                    })

            }

        }

    }

</script>

<style scoped>
    .book2 {
        padding:2%;
        outline: none;
        position: relative;
        height: 30%;
        width: 20%;
    }

</style>
