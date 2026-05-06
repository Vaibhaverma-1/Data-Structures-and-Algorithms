/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function(functions) {
    return function(x) {
        let n = functions.length;
        if(n === 0) return x;

        let val = functions[n-1](x);

        for(let i=n-2; i>=0; i--){
            val = functions[i](val);
        }

        return val;
    }
};

/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */