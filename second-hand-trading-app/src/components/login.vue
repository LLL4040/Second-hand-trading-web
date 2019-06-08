
<template>

<div>

<div class="login">
    <div class="message">二手平台-登陆注册</div>
    <div id="darkbannerwrap"></div>

    <form>
        <input name="username" placeholder="用户名"  type="text" v-model="form.id">
        <hr class="hr15">
        <input name="password" placeholder="密码"  type="password" v-model="form.password">
        <hr class="hr15">
        <input value="登录" style="width:40%;" type="submit" @click="submit">
        <router-link :to="{name:'register'}"><input value="注册"  type="button" style="width:40%;"></router-link>
        <hr class="hr20">
        <!-- 帮助 <a onClick="alert('请联系管理员')">忘记密码</a> -->
    </form>


</div>

<div class="copyright">© 2016品牌名称 by <a href="http://www.mycodes.net/" target="_blank">源码之家</a></div>

</div>
</template>
<style src="../mycss/login.css">

</style>
<script>
    export default {
        name: 'register',
        props: ['message'],
        data () {
            return {
                form: {
                    id: '',
                    password: ''
                }
            }
        },
        mounted () {
            localStorage.clear()
            localStorage.setItem('username', '登陆')
        },
        methods: {
            /* 提交进行判断的函数 */
            submit: function () {

                            alert('登陆成功')
                            localStorage.setItem('username', this.form.id)
                            localStorage.setItem('password', this.form.password)

                            this.$router.push({name: 'home'})

            },
        }
    }
</script>
