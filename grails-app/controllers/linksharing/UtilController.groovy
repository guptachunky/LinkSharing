package linksharing

class UtilController {


    def index() {
        log.warn 'warning'

        log.debug 'Params Example [{}]', params
        [param: params]

        render "rendering"

    }
}
