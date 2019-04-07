package info.novatec.zuul2.filters.endpoint

import com.netflix.zuul.filters.http.HttpSyncEndpoint
import com.netflix.zuul.message.http.HttpRequestMessage
import com.netflix.zuul.message.http.HttpResponseMessage
import com.netflix.zuul.message.http.HttpResponseMessageImpl
import org.apache.http.HttpStatus

class NotFoundEndpoint extends HttpSyncEndpoint {

    @Override
    HttpResponseMessage apply(HttpRequestMessage request) {
        HttpResponseMessage response = new HttpResponseMessageImpl(request.getContext(), request, HttpStatus.SC_NOT_FOUND)
        response.finishBufferedBodyIfIncomplete()
        return response
    }
}
