<template>
    <el-form ref="addForm" label-width="auto">
        <el-form-item label="用户名">
            <el-input v-model="form.name"></el-input>
        </el-form-item>
        <el-form-item label="年龄">
            <el-input v-model="form.age"></el-input>
        </el-form-item>
        <el-button type="primary" @click="onSubmit">立即创建</el-button>
    </el-form>
</template>

<script>
import Qs from 'qs'
export default {
    data() {
        return {
            form:{
                name:"",
                age:null,
            }
        }
    },
    methods:{
        onSubmit() {
            const data = Qs.stringify({
                name:this.form.name,
                age:this.form.age
            },)
            console.log(this.form.name,this.form.age)
            this.$axios
            .post('/api/insert',
            data,
            )
            .then(function (response) {
                alert(response.data);
            })
            .catch(function (error) {
                alert("插入失败");
            });
        }
    }
}
</script>

<style>

</style>