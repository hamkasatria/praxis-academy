const bar = () => console.log('bar')

const baz = () => console.log('baz')

const foo = () => {
  console.log('foo')
  
  setTimeout(bar, 0) // kenapa daalam eksekusi bar ini tidak menggunakan ()
  new Promise((resolve, reject) => resolve('should be right after baz, before bar'))
   .then(resolve => console.log(resolve))// dijalankan terakhit ka
  baz()
}

foo()