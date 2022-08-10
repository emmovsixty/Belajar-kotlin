package data

class Library(title: String) {
    var Book = title
    get() = field
    set(value){
        if(value.isNotBlank()){
            field=value
        }
    }
}