package org.sd_jwt

import com.nimbusds.jose.JWSAlgorithm
import com.nimbusds.jose.JWSHeader
import com.nimbusds.jose.jca.JCAContext
import com.nimbusds.jose.util.Base64URL

class StaticJWSTestSigner(
    private val jwsAlgorithm: JWSAlgorithm,
    private val keyId: String,
): StaticJWSSigner {

    private val jcaContext = JCAContext()
    override fun getAlgorithm(): JWSAlgorithm {
        return jwsAlgorithm
    }

    override fun getKeyId(): String {
        return keyId
    }

    override fun getJCAContext(): JCAContext {
        return jcaContext
    }

    override fun supportedJWSAlgorithms(): MutableSet<JWSAlgorithm> {
        return mutableSetOf(getAlgorithm())
    }

    override fun sign(header: JWSHeader?, signingInput: ByteArray?): Base64URL {
        TODO("Not yet implemented")
    }
}
