import Vue from 'vue'
// import './plugins/axios'
import App from './App.vue'
import router from './router'
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
// import './registerServiceWorker'
import './mycss/owl.carousel.css';
import './mycss/productviewgallery.css';
import './mycss/slider.css';
import './mycss/style.css';
import axios from "axios"
// Object.defineProperty(Vue.prototype, '$myAxios', {
//   value: axios
// })
Vue.prototype.$myAxios= axios
import Global from './components/Global.vue'//引用文件
Vue.prototype.GLOBAL = Global//挂载到Vue实例上面

Vue.use(ElementUI);
Vue.config.productionTip = false

new Vue({
  router,
  render: h => h(App)
}).$mount('#app')
