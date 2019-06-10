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

              <ul class="sub-icon1 list" >
                <router-link router-link :to="{name:'mycenter'}" ><li><h3>个人中心</h3></li></router-link>
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



  <!-- start main1 -->
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
        <!-- start grids_of_3 -->
        <div class="grids_of_3">
          <div class="grid1_of_3">
            <div @click="toDetail">
              <img src="../assets/pic1.jpg" alt=""/>
              <h3>branded shoes</h3>
              <div class="price">
                <h4>$300<span>indulge</span></h4>
              </div>
              <span class="b_btm"></span>
            </div>
          </div>
          <div class="grid1_of_3">
            <div @click="toDetail">
              <img src="../assets/pic2.jpg" alt=""/>
              <h3>branded t-shirts</h3>
              <div class="price">
                <h4>$300<span>indulge</span></h4>
              </div>
              <span class="b_btm"></span>
            </div>
          </div>
          <div class="grid1_of_3">
            <div @click="toDetail">
              <img src="../assets/pic3.jpg" alt=""/>
              <h3>branded tees</h3>
              <div class="price">
                <h4>$300<span>indulge</span></h4>
              </div>
              <span class="b_btm"></span>
            </div>
          </div>
          <div class="clear"></div>
        </div>
        <div class="grids_of_3">
          <div class="grid1_of_3">
            <div @click="toDetail">
              <img src="../assets/pic4.jpg" alt=""/>
              <h3>branded bags</h3>
              <div class="price">
                <h4>$300<span>indulge</span></h4>
              </div>
              <span class="b_btm"></span>
            </div>
          </div>
          <div class="grid1_of_3">
            <div @click="toDetail">
              <img src="../assets/pic5.jpg" alt=""/>
              <h3>ems women bag</h3>
              <div class="price">
                <h4>$300<span>indulge</span></h4>
              </div>
              <span class="b_btm"></span>
            </div>
          </div>
          <div class="grid1_of_3">
            <div @click="toDetail">
              <img src="../assets/pic6.jpg" alt=""/>
              <h3>branded cargos</h3>
              <div class="price">
                <h4>$300<span>indulge</span></h4>
              </div>
              <span class="b_btm"></span>
            </div>
          </div>
          <div class="clear"></div>
        </div>
        <!-- end grids_of_3 -->

<!--        这些是与数据库直接相关的-->
        <div class="grids_of_3" v-for=" o in goodsData.length/3" :key="o">
        <div class="grid1_of_3">
          <div @click="toDetail(goodsData[3*(o-1)].goods_id)">
            <img src="../assets/pic4.jpg" alt=""/>
            <h3>{{goodsData[3*(o-1)].title}}</h3>
            <div class="price">
              <h4>{{goodsData[3*(o-1)].detail}}<span>detail</span></h4>
            </div>
            <span class="b_btm"></span>
          </div>
        </div>
          <div class="grid1_of_3">
          <div @click="toDetail(goodsData[3*(o-1)+1].goods_id)">
            <img src="../assets/pic4.jpg" alt=""/>
            <h3>{{goodsData[3*(o-1)+1].title}}</h3>
            <div class="price">
              <h4>{{goodsData[3*(o-1)+1].detail}}<span>detail</span></h4>
            </div>
            <span class="b_btm"></span>
          </div>
          </div>
          <div class="grid1_of_3">
          <div @click="toDetail(goodsData[3*(o-1)+2].goods_id)">
            <img src="../assets/pic4.jpg" alt=""/>
            <h3>{{goodsData[3*(o-1)+2].title}}</h3>
            <div class="price">
              <h4>{{goodsData[3*(o-1)+2].detail}}<span>detail</span></h4>
            </div>
            <span class="b_btm"></span>
          </div>
          </div>

          <div class="clear"></div>
      </div>
<!--        end of main-->
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
        <div class="copy">
          <p class="link">Copyright &copy; 2014.Company name All rights reserved.<a target="_blank" href="http://www.cssmoban.com/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a> -  More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a></p>
        </div>
        <div class="clear"></div>
      </div>
    </div>
  </div>

  </body>

</template>
<!--<script src="../js/responsive.menu.js"></script>-->

<script>


export default {
  name: 'index',
   data () {
        return {
          message: localStorage.getItem('username'),
          goodsData:[],
          goods_id: 0,

        }
    },
  mounted(){
    this.loadGoods();
  },
  methods:{
    toDetail(goods_id){

      this.GLOBAL.username = this.message;
      this.GLOBAL.goods_id=goods_id;
      console.log(this.GLOBAL.goods_id);
      this.$router.push({ path: `/detail` });


    },
    login(){
      this.$router.push({ path: `/login` });


    },
    addGoods(){
      this.$router.push({ path: `/addGoods` });
    },
    loadGoods(){
      this.$myAxios.get('/goods/getAllGoods')
              .then((response)=> {
                var that = this;
                for(var i=0;i<response.data.length;i++){
                  var objproject = {
                    "goods_id" : response.data[i].goods_id,//这个是赋值到一个数组对象里面去，开发的时候就是取到里面的值进行一个逻辑判断，要干嘛干嘛的。这个也加上他的下标
                    "contact" : response.data[i].contact,
                    "cover" : response.data[i].cover,
                    "detail" : response.data[i].detail,
                    "status" :response.data[i].status,
                    "title" :response.data[i].title,
                    "username":response.data[i].username,
                  }
                  that.goodsData.push(objproject);
                  console.log(that.goodsData[i]);

                  console.log(that.goodsData[i].title);

                }
                this.$forceUpdate();//强制刷新

              })
              .catch(function (error) {
                console.log(error);  // 失败
              });
    },
  }

}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  @import "../mycss/owl.carousel.css";



</style>
