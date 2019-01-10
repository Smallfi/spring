import web

urls = (
    '/', 'index'
)

class index:
    def GET(self):
        return "Hello, world!1234"

if __name__ == "__main__":
    app = web.application(urls, globals())
    app.run()