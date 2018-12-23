def hello_korean():
    print('안녕하세요.')
def hello_english():
    print('Hello.')
def get_greeting(where):
    if where =='K':
        return hello_korean
    else :
        return hello_english

hello = get_greeting('K')
hello()
hello = get_greeting('E')
hello()
