function mapSemthis(arr) {
    return arr.map(function(item){
        return item * 2
    });
}

const nums = [-1, 2, 4, 6, 8, 10];

console.log(mapSemthis(nums));
console.log(nums);
