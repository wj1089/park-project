import router from '@/router'
import axios from 'axios'

const state={
    context:'http://localhost:5000/',

}
const actions={
    async search({commit},searchWord){
        alert('검색어 : ' + searchWord)
        axios.get(state.context+"gym/list/0/"+searchWord)
            .then(({data})=>{
                commit('GYM',data)
                router.push('/gym')
            })
            .catch( error =>{
                alert(`통신실패입니다 :: ${error}`)
            })
    }
}
const  mutations={
    GYM(state, data){
        alert('뮤테이션 접속' + data.count);
        console.log('aaa')
        state.gyms =[];
        state.count = data.count;
        data.list.forEach(item =>{state.gyms.push({
            ser_Num: item.ser_Num,
            open_YN: item.open_YN,
            number : item.number,
            address: item.address,
            mailing_address: item.mailing_address,
            name : item.name,
        });
        });
    }
};
const getters={
    gym: state => state.gym,
    count :state => state.count

}
export default {
    name : "gym",
    namespaced : true,
    state,
    actions,
    mutations,
    getters
}