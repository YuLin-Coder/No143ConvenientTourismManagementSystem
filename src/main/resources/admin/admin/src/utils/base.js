const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot0q1q8/",
            name: "springboot0q1q8",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot0q1q8/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "便捷式管理系统"
        } 
    }
}
export default base
