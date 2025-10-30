.class public final Lk4/k;
.super Lk4/g;
.source "SourceFile"


# instance fields
.field public e:Lk4/p;

.field public f:[B

.field public g:I

.field public h:I


# virtual methods
.method public final D([BII)I
    .locals 2

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return p1

    .line 5
    :cond_0
    iget v0, p0, Lk4/k;->h:I

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p1, -0x1

    .line 10
    return p1

    .line 11
    :cond_1
    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    .line 12
    .line 13
    .line 14
    move-result p3

    .line 15
    iget-object v0, p0, Lk4/k;->f:[B

    .line 16
    .line 17
    sget v1, Ll4/y;->a:I

    .line 18
    .line 19
    iget v1, p0, Lk4/k;->g:I

    .line 20
    .line 21
    invoke-static {v0, v1, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 22
    .line 23
    .line 24
    iget p1, p0, Lk4/k;->g:I

    .line 25
    .line 26
    add-int/2addr p1, p3

    .line 27
    iput p1, p0, Lk4/k;->g:I

    .line 28
    .line 29
    iget p1, p0, Lk4/k;->h:I

    .line 30
    .line 31
    sub-int/2addr p1, p3

    .line 32
    iput p1, p0, Lk4/k;->h:I

    .line 33
    .line 34
    invoke-virtual {p0, p3}, Lk4/g;->c(I)V

    .line 35
    .line 36
    .line 37
    return p3
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
.end method

.method public final close()V
    .locals 2

    .line 1
    iget-object v0, p0, Lk4/k;->f:[B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-object v1, p0, Lk4/k;->f:[B

    .line 7
    .line 8
    invoke-virtual {p0}, Lk4/g;->d()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iput-object v1, p0, Lk4/k;->e:Lk4/p;

    .line 12
    .line 13
    return-void
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
.end method

.method public final g(Lk4/p;)J
    .locals 7

    .line 1
    invoke-virtual {p0}, Lk4/g;->h()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk4/k;->e:Lk4/p;

    .line 5
    .line 6
    iget-object v0, p1, Lk4/p;->a:Landroid/net/Uri;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "data"

    .line 13
    .line 14
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    new-instance v3, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v4, "Unsupported scheme: "

    .line 21
    .line 22
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-static {v1, v2}, Ll4/a;->g(Ljava/lang/String;Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/net/Uri;->getSchemeSpecificPart()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    sget v2, Ll4/y;->a:I

    .line 40
    .line 41
    const/4 v2, -0x1

    .line 42
    const-string v3, ","

    .line 43
    .line 44
    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    array-length v2, v1

    .line 49
    const/4 v3, 0x0

    .line 50
    const/4 v4, 0x1

    .line 51
    const/4 v5, 0x2

    .line 52
    const/4 v6, 0x0

    .line 53
    if-ne v2, v5, :cond_4

    .line 54
    .line 55
    aget-object v0, v1, v4

    .line 56
    .line 57
    aget-object v1, v1, v3

    .line 58
    .line 59
    const-string v2, ";base64"

    .line 60
    .line 61
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_0

    .line 66
    .line 67
    :try_start_0
    invoke-static {v0, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    iput-object v1, p0, Lk4/k;->f:[B
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :catch_0
    move-exception p1

    .line 75
    const-string v1, "Error while parsing Base64 encoded string: "

    .line 76
    .line 77
    invoke-static {v1, v0}, Lu0/z;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    new-instance v1, Lj3/j0;

    .line 82
    .line 83
    invoke-direct {v1, v0, p1, v4, v3}, Lj3/j0;-><init>(Ljava/lang/String;Ljava/lang/Exception;ZI)V

    .line 84
    .line 85
    .line 86
    throw v1

    .line 87
    :cond_0
    sget-object v1, LO5/e;->a:Ljava/nio/charset/Charset;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-static {v0, v1}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    sget-object v1, LO5/e;->c:Ljava/nio/charset/Charset;

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    iput-object v0, p0, Lk4/k;->f:[B

    .line 104
    .line 105
    :goto_0
    iget-object v0, p0, Lk4/k;->f:[B

    .line 106
    .line 107
    array-length v1, v0

    .line 108
    int-to-long v1, v1

    .line 109
    iget-wide v3, p1, Lk4/p;->e:J

    .line 110
    .line 111
    cmp-long v1, v3, v1

    .line 112
    .line 113
    if-gtz v1, :cond_3

    .line 114
    .line 115
    long-to-int v1, v3

    .line 116
    iput v1, p0, Lk4/k;->g:I

    .line 117
    .line 118
    array-length v0, v0

    .line 119
    sub-int/2addr v0, v1

    .line 120
    iput v0, p0, Lk4/k;->h:I

    .line 121
    .line 122
    const-wide/16 v1, -0x1

    .line 123
    .line 124
    iget-wide v3, p1, Lk4/p;->f:J

    .line 125
    .line 126
    cmp-long v1, v3, v1

    .line 127
    .line 128
    if-eqz v1, :cond_1

    .line 129
    .line 130
    int-to-long v5, v0

    .line 131
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->min(JJ)J

    .line 132
    .line 133
    .line 134
    move-result-wide v5

    .line 135
    long-to-int v0, v5

    .line 136
    iput v0, p0, Lk4/k;->h:I

    .line 137
    .line 138
    :cond_1
    invoke-virtual {p0, p1}, Lk4/g;->i(Lk4/p;)V

    .line 139
    .line 140
    .line 141
    if-eqz v1, :cond_2

    .line 142
    .line 143
    return-wide v3

    .line 144
    :cond_2
    iget p1, p0, Lk4/k;->h:I

    .line 145
    .line 146
    int-to-long v0, p1

    .line 147
    return-wide v0

    .line 148
    :cond_3
    iput-object v6, p0, Lk4/k;->f:[B

    .line 149
    .line 150
    new-instance p1, Lk4/n;

    .line 151
    .line 152
    const/16 v0, 0x7d8

    .line 153
    .line 154
    invoke-direct {p1, v0}, Lk4/n;-><init>(I)V

    .line 155
    .line 156
    .line 157
    throw p1

    .line 158
    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    const-string v1, "Unexpected URI format: "

    .line 161
    .line 162
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    new-instance v0, Lj3/j0;

    .line 173
    .line 174
    invoke-direct {v0, p1, v6, v4, v3}, Lj3/j0;-><init>(Ljava/lang/String;Ljava/lang/Exception;ZI)V

    .line 175
    .line 176
    .line 177
    throw v0
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
.end method

.method public final s()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lk4/k;->e:Lk4/p;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lk4/p;->a:Landroid/net/Uri;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    return-object v0
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
.end method
