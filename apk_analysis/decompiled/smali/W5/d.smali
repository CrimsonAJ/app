.class public abstract LW5/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public static d(I)I
    .locals 1

    .line 1
    ushr-int/lit8 v0, p0, 0x1

    .line 2
    .line 3
    and-int/lit8 p0, p0, 0x1

    .line 4
    .line 5
    neg-int p0, p0

    .line 6
    xor-int/2addr p0, v0

    .line 7
    return p0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public static e(J)J
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    ushr-long v0, p0, v0

    .line 3
    .line 4
    const-wide/16 v2, 0x1

    .line 5
    .line 6
    and-long/2addr p0, v2

    .line 7
    neg-long p0, p0

    .line 8
    xor-long/2addr p0, v0

    .line 9
    return-wide p0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public static h([BIIZ)Lcom/google/crypto/tink/shaded/protobuf/i;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/i;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/i;-><init>([BIIZ)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/i;->l(I)I
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/B; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    return-object v0

    .line 10
    :catch_0
    move-exception p0

    .line 11
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 12
    .line 13
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    throw p1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
.end method


# virtual methods
.method public abstract A()Ljava/lang/String;
.end method

.method public abstract B()Ljava/lang/String;
.end method

.method public abstract C()I
.end method

.method public abstract D()I
.end method

.method public abstract E()J
.end method

.method public abstract F(I)Z
.end method

.method public G()V
    .locals 3

    .line 1
    :cond_0
    invoke-virtual {p0}, LW5/d;->C()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_1
    iget v1, p0, LW5/d;->a:I

    .line 9
    .line 10
    const/16 v2, 0x64

    .line 11
    .line 12
    if-ge v1, v2, :cond_2

    .line 13
    .line 14
    add-int/lit8 v1, v1, 0x1

    .line 15
    .line 16
    iput v1, p0, LW5/d;->a:I

    .line 17
    .line 18
    invoke-virtual {p0, v0}, LW5/d;->F(I)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v1, p0, LW5/d;->a:I

    .line 23
    .line 24
    add-int/lit8 v1, v1, -0x1

    .line 25
    .line 26
    iput v1, p0, LW5/d;->a:I

    .line 27
    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    :goto_0
    return-void

    .line 31
    :cond_2
    new-instance v0, Landroidx/datastore/preferences/protobuf/x;

    .line 32
    .line 33
    const-string v1, "Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit."

    .line 34
    .line 35
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v0
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
.end method

.method public a(I[B)Ljava/nio/ByteBuffer;
    .locals 4

    .line 1
    invoke-static {p2}, LW5/a;->c([B)[I

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p0, p2, p1}, LW5/d;->c([II)[I

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, [I->clone()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    check-cast p2, [I

    .line 14
    .line 15
    invoke-static {p2}, LW5/a;->b([I)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    move v1, v0

    .line 20
    :goto_0
    array-length v2, p1

    .line 21
    if-ge v1, v2, :cond_0

    .line 22
    .line 23
    aget v2, p1, v1

    .line 24
    .line 25
    aget v3, p2, v1

    .line 26
    .line 27
    add-int/2addr v2, v3

    .line 28
    aput v2, p1, v1

    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/16 p2, 0x40

    .line 34
    .line 35
    invoke-static {p2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 40
    .line 41
    invoke-virtual {p2, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->asIntBuffer()Ljava/nio/IntBuffer;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const/16 v2, 0x10

    .line 50
    .line 51
    invoke-virtual {v1, p1, v0, v2}, Ljava/nio/IntBuffer;->put([III)Ljava/nio/IntBuffer;

    .line 52
    .line 53
    .line 54
    return-object p2
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
.end method

.method public abstract b(I)V
.end method

.method public abstract c([II)[I
.end method

.method public abstract f()I
.end method

.method public abstract g()Z
.end method

.method public abstract i()I
.end method

.method public abstract j(I)V
.end method

.method public k([BLjava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)V
    .locals 6

    .line 1
    array-length v0, p1

    .line 2
    invoke-virtual {p0}, LW5/d;->i()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ne v0, v1, :cond_2

    .line 7
    .line 8
    invoke-virtual {p3}, Ljava/nio/Buffer;->remaining()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    div-int/lit8 v1, v0, 0x40

    .line 13
    .line 14
    add-int/lit8 v2, v1, 0x1

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    :goto_0
    if-ge v3, v2, :cond_1

    .line 18
    .line 19
    iget v4, p0, LW5/d;->a:I

    .line 20
    .line 21
    add-int/2addr v4, v3

    .line 22
    invoke-virtual {p0, v4, p1}, LW5/d;->a(I[B)Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    const/16 v5, 0x40

    .line 27
    .line 28
    if-ne v3, v1, :cond_0

    .line 29
    .line 30
    rem-int/lit8 v5, v0, 0x40

    .line 31
    .line 32
    invoke-static {p2, p3, v4, v5}, Lcom/google/android/gms/internal/measurement/D1;->O(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)V

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    invoke-static {p2, p3, v4, v5}, Lcom/google/android/gms/internal/measurement/D1;->O(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)V

    .line 37
    .line 38
    .line 39
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    return-void

    .line 43
    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 44
    .line 45
    new-instance p2, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string p3, "The nonce length (in bytes) must be "

    .line 48
    .line 49
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, LW5/d;->i()I

    .line 53
    .line 54
    .line 55
    move-result p3

    .line 56
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p1
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
.end method

.method public abstract l(I)I
.end method

.method public abstract m()Z
.end method

.method public abstract n()Landroidx/datastore/preferences/protobuf/g;
.end method

.method public abstract o()Lcom/google/crypto/tink/shaded/protobuf/g;
.end method

.method public abstract p()D
.end method

.method public abstract q()I
.end method

.method public abstract r()I
.end method

.method public abstract s()J
.end method

.method public abstract t()F
.end method

.method public abstract u()I
.end method

.method public abstract v()J
.end method

.method public abstract w()I
.end method

.method public abstract x()J
.end method

.method public abstract y()I
.end method

.method public abstract z()J
.end method
