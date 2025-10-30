.class public final Lp3/a;
.super Lk4/g;
.source "SourceFile"


# instance fields
.field public final e:Li8/E;

.field public final f:Lk4/E;

.field public final g:Lk4/E;

.field public h:Li8/L;

.field public i:Ljava/io/InputStream;

.field public j:Z

.field public k:J

.field public l:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "goog.exo.okhttp"

    .line 2
    .line 3
    invoke-static {v0}, Lj3/K;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
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
.end method

.method public constructor <init>(Li8/E;Lk4/E;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lk4/g;-><init>(Z)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lp3/a;->e:Li8/E;

    .line 9
    .line 10
    iput-object p2, p0, Lp3/a;->g:Lk4/E;

    .line 11
    .line 12
    new-instance p1, Lk4/E;

    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    invoke-direct {p1, p2}, Lk4/E;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lp3/a;->f:Lk4/E;

    .line 19
    .line 20
    return-void
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
.end method


# virtual methods
.method public final D([BII)I
    .locals 6

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return p1

    .line 5
    :cond_0
    :try_start_0
    iget-wide v0, p0, Lp3/a;->k:J

    .line 6
    .line 7
    const-wide/16 v2, -0x1

    .line 8
    .line 9
    cmp-long v2, v0, v2

    .line 10
    .line 11
    const/4 v3, -0x1

    .line 12
    if-eqz v2, :cond_2

    .line 13
    .line 14
    iget-wide v4, p0, Lp3/a;->l:J

    .line 15
    .line 16
    sub-long/2addr v0, v4

    .line 17
    const-wide/16 v4, 0x0

    .line 18
    .line 19
    cmp-long v2, v0, v4

    .line 20
    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    int-to-long v4, p3

    .line 25
    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    long-to-int p3, v0

    .line 30
    :cond_2
    iget-object v0, p0, Lp3/a;->i:Ljava/io/InputStream;

    .line 31
    .line 32
    sget v1, Ll4/y;->a:I

    .line 33
    .line 34
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-ne p1, v3, :cond_3

    .line 39
    .line 40
    :goto_0
    return v3

    .line 41
    :cond_3
    iget-wide p2, p0, Lp3/a;->l:J

    .line 42
    .line 43
    int-to-long v0, p1

    .line 44
    add-long/2addr p2, v0

    .line 45
    iput-wide p2, p0, Lp3/a;->l:J

    .line 46
    .line 47
    invoke-virtual {p0, p1}, Lk4/g;->c(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    .line 49
    .line 50
    return p1

    .line 51
    :catch_0
    move-exception p1

    .line 52
    sget p2, Ll4/y;->a:I

    .line 53
    .line 54
    const/4 p2, 0x2

    .line 55
    invoke-static {p2, p1}, Lk4/B;->a(ILjava/io/IOException;)Lk4/B;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    throw p1
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
    .locals 1

    .line 1
    iget-boolean v0, p0, Lp3/a;->j:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lp3/a;->j:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lk4/g;->d()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lp3/a;->k()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
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
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    iput-wide v2, v1, Lp3/a;->l:J

    .line 8
    .line 9
    iput-wide v2, v1, Lp3/a;->k:J

    .line 10
    .line 11
    invoke-virtual {v1}, Lk4/g;->h()V

    .line 12
    .line 13
    .line 14
    iget-wide v4, v0, Lk4/p;->e:J

    .line 15
    .line 16
    iget-object v6, v0, Lk4/p;->a:Landroid/net/Uri;

    .line 17
    .line 18
    invoke-virtual {v6}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v6

    .line 22
    const-string v7, "<this>"

    .line 23
    .line 24
    invoke-static {v6, v7}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 v7, 0x0

    .line 28
    :try_start_0
    new-instance v8, Li8/x;

    .line 29
    .line 30
    invoke-direct {v8}, Li8/x;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v8, v7, v6}, Li8/x;->e(Li8/y;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v8}, Li8/x;->b()Li8/y;

    .line 37
    .line 38
    .line 39
    move-result-object v6
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    goto :goto_0

    .line 41
    :catch_0
    move-object v6, v7

    .line 42
    :goto_0
    if-eqz v6, :cond_d

    .line 43
    .line 44
    new-instance v8, LY2/r;

    .line 45
    .line 46
    const/4 v9, 0x5

    .line 47
    invoke-direct {v8, v9}, LY2/r;-><init>(I)V

    .line 48
    .line 49
    .line 50
    iput-object v6, v8, LY2/r;->a:Ljava/lang/Object;

    .line 51
    .line 52
    new-instance v6, Ljava/util/HashMap;

    .line 53
    .line 54
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 55
    .line 56
    .line 57
    iget-object v9, v1, Lp3/a;->g:Lk4/E;

    .line 58
    .line 59
    if-eqz v9, :cond_0

    .line 60
    .line 61
    invoke-virtual {v9}, Lk4/E;->l()Ljava/util/Map;

    .line 62
    .line 63
    .line 64
    move-result-object v9

    .line 65
    invoke-virtual {v6, v9}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 66
    .line 67
    .line 68
    :cond_0
    iget-object v9, v1, Lp3/a;->f:Lk4/E;

    .line 69
    .line 70
    invoke-virtual {v9}, Lk4/E;->l()Ljava/util/Map;

    .line 71
    .line 72
    .line 73
    move-result-object v9

    .line 74
    invoke-virtual {v6, v9}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 75
    .line 76
    .line 77
    iget-object v9, v0, Lk4/p;->d:Ljava/util/Map;

    .line 78
    .line 79
    invoke-virtual {v6, v9}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v6}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v9

    .line 94
    if-eqz v9, :cond_1

    .line 95
    .line 96
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v9

    .line 100
    check-cast v9, Ljava/util/Map$Entry;

    .line 101
    .line 102
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v10

    .line 106
    check-cast v10, Ljava/lang/String;

    .line 107
    .line 108
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v9

    .line 112
    check-cast v9, Ljava/lang/String;

    .line 113
    .line 114
    invoke-virtual {v8, v10, v9}, LY2/r;->D(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_1
    iget-wide v9, v0, Lk4/p;->f:J

    .line 119
    .line 120
    invoke-static {v4, v5, v9, v10}, Lk4/F;->a(JJ)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    if-eqz v4, :cond_2

    .line 125
    .line 126
    const-string v5, "Range"

    .line 127
    .line 128
    invoke-virtual {v8, v5, v4}, LY2/r;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    :cond_2
    iget v4, v0, Lk4/p;->h:I

    .line 132
    .line 133
    const/4 v5, 0x1

    .line 134
    and-int/2addr v4, v5

    .line 135
    if-ne v4, v5, :cond_3

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_3
    const-string v4, "Accept-Encoding"

    .line 139
    .line 140
    const-string v6, "identity"

    .line 141
    .line 142
    invoke-virtual {v8, v4, v6}, LY2/r;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    :goto_2
    const/4 v4, 0x0

    .line 146
    iget v6, v0, Lk4/p;->b:I

    .line 147
    .line 148
    iget-object v11, v0, Lk4/p;->c:[B

    .line 149
    .line 150
    if-eqz v11, :cond_4

    .line 151
    .line 152
    array-length v12, v11

    .line 153
    array-length v13, v11

    .line 154
    int-to-long v14, v13

    .line 155
    move-wide/from16 v20, v2

    .line 156
    .line 157
    int-to-long v2, v4

    .line 158
    move/from16 v22, v6

    .line 159
    .line 160
    int-to-long v5, v12

    .line 161
    move-wide/from16 v16, v2

    .line 162
    .line 163
    move-wide/from16 v18, v5

    .line 164
    .line 165
    invoke-static/range {v14 .. v19}, Lk8/c;->c(JJJ)V

    .line 166
    .line 167
    .line 168
    new-instance v2, Li8/I;

    .line 169
    .line 170
    invoke-direct {v2, v7, v12, v11}, Li8/I;-><init>(Li8/A;I[B)V

    .line 171
    .line 172
    .line 173
    move/from16 v3, v22

    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_4
    move-wide/from16 v20, v2

    .line 177
    .line 178
    move/from16 v22, v6

    .line 179
    .line 180
    const/4 v2, 0x2

    .line 181
    move/from16 v3, v22

    .line 182
    .line 183
    if-ne v3, v2, :cond_5

    .line 184
    .line 185
    sget-object v2, Ll4/y;->f:[B

    .line 186
    .line 187
    const-string v5, "content"

    .line 188
    .line 189
    invoke-static {v2, v5}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    array-length v5, v2

    .line 193
    array-length v6, v2

    .line 194
    int-to-long v14, v6

    .line 195
    int-to-long v11, v4

    .line 196
    move-wide/from16 v16, v14

    .line 197
    .line 198
    int-to-long v13, v5

    .line 199
    move-wide/from16 v18, v13

    .line 200
    .line 201
    move-wide/from16 v14, v16

    .line 202
    .line 203
    move-wide/from16 v16, v11

    .line 204
    .line 205
    invoke-static/range {v14 .. v19}, Lk8/c;->c(JJJ)V

    .line 206
    .line 207
    .line 208
    new-instance v6, Li8/I;

    .line 209
    .line 210
    invoke-direct {v6, v7, v5, v2}, Li8/I;-><init>(Li8/A;I[B)V

    .line 211
    .line 212
    .line 213
    move-object v2, v6

    .line 214
    goto :goto_3

    .line 215
    :cond_5
    move-object v2, v7

    .line 216
    :goto_3
    invoke-static {v3}, Lk4/p;->b(I)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    invoke-virtual {v8, v3, v2}, LY2/r;->G(Ljava/lang/String;Li8/J;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v8}, LY2/r;->o()Li8/G;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    iget-object v3, v1, Lp3/a;->e:Li8/E;

    .line 228
    .line 229
    invoke-virtual {v3, v2}, Li8/E;->c(Li8/G;)Ln8/g;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    :try_start_1
    new-instance v3, LS5/q;

    .line 234
    .line 235
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 236
    .line 237
    .line 238
    new-instance v5, Lcom/google/firebase/messaging/u;

    .line 239
    .line 240
    invoke-direct {v5, v3}, Lcom/google/firebase/messaging/u;-><init>(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v2, v5}, Ln8/g;->f(Li8/j;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3

    .line 244
    .line 245
    .line 246
    :try_start_2
    invoke-virtual {v3}, LS5/n;->get()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    check-cast v3, Li8/L;
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3

    .line 251
    .line 252
    :try_start_3
    iput-object v3, v1, Lp3/a;->h:Li8/L;

    .line 253
    .line 254
    iget-object v2, v3, Li8/L;->g:Li8/N;

    .line 255
    .line 256
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v2}, Li8/N;->g()Lx8/i;

    .line 260
    .line 261
    .line 262
    move-result-object v5

    .line 263
    invoke-interface {v5}, Lx8/i;->e0()Ljava/io/InputStream;

    .line 264
    .line 265
    .line 266
    move-result-object v5

    .line 267
    iput-object v5, v1, Lp3/a;->i:Ljava/io/InputStream;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    .line 268
    .line 269
    invoke-virtual {v3}, Li8/L;->g()Z

    .line 270
    .line 271
    .line 272
    move-result v5

    .line 273
    const-wide/16 v11, -0x1

    .line 274
    .line 275
    iget-wide v14, v0, Lk4/p;->e:J

    .line 276
    .line 277
    iget v6, v3, Li8/L;->d:I

    .line 278
    .line 279
    if-nez v5, :cond_9

    .line 280
    .line 281
    iget-object v2, v3, Li8/L;->f:Li8/w;

    .line 282
    .line 283
    const/16 v3, 0x1a0

    .line 284
    .line 285
    if-ne v6, v3, :cond_7

    .line 286
    .line 287
    const-string v5, "Content-Range"

    .line 288
    .line 289
    invoke-virtual {v2, v5}, Li8/w;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v5

    .line 293
    invoke-static {v5}, Lk4/F;->b(Ljava/lang/String;)J

    .line 294
    .line 295
    .line 296
    move-result-wide v16

    .line 297
    cmp-long v5, v14, v16

    .line 298
    .line 299
    if-nez v5, :cond_7

    .line 300
    .line 301
    const/4 v13, 0x1

    .line 302
    iput-boolean v13, v1, Lp3/a;->j:Z

    .line 303
    .line 304
    invoke-virtual/range {p0 .. p1}, Lk4/g;->i(Lk4/p;)V

    .line 305
    .line 306
    .line 307
    cmp-long v0, v9, v11

    .line 308
    .line 309
    if-eqz v0, :cond_6

    .line 310
    .line 311
    move-wide v2, v9

    .line 312
    goto :goto_4

    .line 313
    :cond_6
    move-wide/from16 v2, v20

    .line 314
    .line 315
    :goto_4
    return-wide v2

    .line 316
    :cond_7
    :try_start_4
    iget-object v0, v1, Lp3/a;->i:Ljava/io/InputStream;

    .line 317
    .line 318
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    invoke-static {v0}, Ll4/y;->R(Ljava/io/InputStream;)[B
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    .line 322
    .line 323
    .line 324
    goto :goto_5

    .line 325
    :catch_1
    sget v0, Ll4/y;->a:I

    .line 326
    .line 327
    :goto_5
    invoke-virtual {v2}, Li8/w;->e()Ljava/util/TreeMap;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    invoke-virtual {v1}, Lp3/a;->k()V

    .line 332
    .line 333
    .line 334
    if-ne v6, v3, :cond_8

    .line 335
    .line 336
    new-instance v7, Lk4/n;

    .line 337
    .line 338
    const/16 v2, 0x7d8

    .line 339
    .line 340
    invoke-direct {v7, v2}, Lk4/n;-><init>(I)V

    .line 341
    .line 342
    .line 343
    :cond_8
    new-instance v2, Lk4/D;

    .line 344
    .line 345
    invoke-direct {v2, v6, v7, v0}, Lk4/D;-><init>(ILk4/n;Ljava/util/Map;)V

    .line 346
    .line 347
    .line 348
    throw v2

    .line 349
    :cond_9
    invoke-virtual {v2}, Li8/N;->d()Li8/A;

    .line 350
    .line 351
    .line 352
    const/16 v3, 0xc8

    .line 353
    .line 354
    if-ne v6, v3, :cond_a

    .line 355
    .line 356
    cmp-long v3, v14, v20

    .line 357
    .line 358
    if-eqz v3, :cond_a

    .line 359
    .line 360
    goto :goto_6

    .line 361
    :cond_a
    move-wide/from16 v14, v20

    .line 362
    .line 363
    :goto_6
    cmp-long v3, v9, v11

    .line 364
    .line 365
    if-eqz v3, :cond_b

    .line 366
    .line 367
    iput-wide v9, v1, Lp3/a;->k:J

    .line 368
    .line 369
    :goto_7
    const/4 v13, 0x1

    .line 370
    goto :goto_8

    .line 371
    :cond_b
    invoke-virtual {v2}, Li8/N;->a()J

    .line 372
    .line 373
    .line 374
    move-result-wide v2

    .line 375
    cmp-long v4, v2, v11

    .line 376
    .line 377
    if-eqz v4, :cond_c

    .line 378
    .line 379
    sub-long v11, v2, v14

    .line 380
    .line 381
    :cond_c
    iput-wide v11, v1, Lp3/a;->k:J

    .line 382
    .line 383
    goto :goto_7

    .line 384
    :goto_8
    iput-boolean v13, v1, Lp3/a;->j:Z

    .line 385
    .line 386
    invoke-virtual/range {p0 .. p1}, Lk4/g;->i(Lk4/p;)V

    .line 387
    .line 388
    .line 389
    :try_start_5
    invoke-virtual {v1, v14, v15}, Lp3/a;->o(J)V
    :try_end_5
    .catch Lk4/B; {:try_start_5 .. :try_end_5} :catch_2

    .line 390
    .line 391
    .line 392
    iget-wide v2, v1, Lp3/a;->k:J

    .line 393
    .line 394
    return-wide v2

    .line 395
    :catch_2
    move-exception v0

    .line 396
    invoke-virtual {v1}, Lp3/a;->k()V

    .line 397
    .line 398
    .line 399
    throw v0

    .line 400
    :catch_3
    move-exception v0

    .line 401
    const/4 v13, 0x1

    .line 402
    goto :goto_9

    .line 403
    :catch_4
    move-exception v0

    .line 404
    :try_start_6
    new-instance v2, Ljava/io/IOException;

    .line 405
    .line 406
    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 407
    .line 408
    .line 409
    throw v2

    .line 410
    :catch_5
    invoke-virtual {v2}, Ln8/g;->cancel()V

    .line 411
    .line 412
    .line 413
    new-instance v0, Ljava/io/InterruptedIOException;

    .line 414
    .line 415
    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    .line 416
    .line 417
    .line 418
    throw v0
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3

    .line 419
    :goto_9
    invoke-static {v13, v0}, Lk4/B;->a(ILjava/io/IOException;)Lk4/B;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    throw v0

    .line 424
    :cond_d
    new-instance v0, Lk4/B;

    .line 425
    .line 426
    const-string v2, "Malformed URL"

    .line 427
    .line 428
    const/16 v3, 0x3ec

    .line 429
    .line 430
    invoke-direct {v0, v2, v3}, Lk4/B;-><init>(Ljava/lang/String;I)V

    .line 431
    .line 432
    .line 433
    throw v0
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
.end method

.method public final k()V
    .locals 2

    .line 1
    iget-object v0, p0, Lp3/a;->h:Li8/L;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, v0, Li8/L;->g:Li8/N;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Li8/N;->close()V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, Lp3/a;->h:Li8/L;

    .line 15
    .line 16
    :cond_0
    iput-object v1, p0, Lp3/a;->i:Ljava/io/InputStream;

    .line 17
    .line 18
    return-void
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

.method public final l()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lp3/a;->h:Li8/L;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    iget-object v0, v0, Li8/L;->f:Li8/w;

    .line 9
    .line 10
    invoke-virtual {v0}, Li8/w;->e()Ljava/util/TreeMap;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
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

.method public final o(J)V
    .locals 7

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    if-nez v2, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    const/16 v2, 0x1000

    .line 9
    .line 10
    new-array v3, v2, [B

    .line 11
    .line 12
    :goto_0
    cmp-long v4, p1, v0

    .line 13
    .line 14
    if-lez v4, :cond_4

    .line 15
    .line 16
    int-to-long v4, v2

    .line 17
    :try_start_0
    invoke-static {p1, p2, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 18
    .line 19
    .line 20
    move-result-wide v4

    .line 21
    long-to-int v4, v4

    .line 22
    iget-object v5, p0, Lp3/a;->i:Ljava/io/InputStream;

    .line 23
    .line 24
    sget v6, Ll4/y;->a:I

    .line 25
    .line 26
    const/4 v6, 0x0

    .line 27
    invoke-virtual {v5, v3, v6, v4}, Ljava/io/InputStream;->read([BII)I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-virtual {v5}, Ljava/lang/Thread;->isInterrupted()Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-nez v5, :cond_2

    .line 40
    .line 41
    const/4 v5, -0x1

    .line 42
    if-eq v4, v5, :cond_1

    .line 43
    .line 44
    int-to-long v5, v4

    .line 45
    sub-long/2addr p1, v5

    .line 46
    invoke-virtual {p0, v4}, Lk4/g;->c(I)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catch_0
    move-exception p1

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    new-instance p1, Lk4/B;

    .line 53
    .line 54
    const/16 p2, 0x7d8

    .line 55
    .line 56
    invoke-direct {p1, p2}, Lk4/B;-><init>(I)V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_2
    new-instance p1, Ljava/io/InterruptedIOException;

    .line 61
    .line 62
    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    .line 63
    .line 64
    .line 65
    throw p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    :goto_1
    instance-of p2, p1, Lk4/B;

    .line 67
    .line 68
    if-eqz p2, :cond_3

    .line 69
    .line 70
    check-cast p1, Lk4/B;

    .line 71
    .line 72
    throw p1

    .line 73
    :cond_3
    new-instance p1, Lk4/B;

    .line 74
    .line 75
    const/16 p2, 0x7d0

    .line 76
    .line 77
    invoke-direct {p1, p2}, Lk4/B;-><init>(I)V

    .line 78
    .line 79
    .line 80
    throw p1

    .line 81
    :cond_4
    :goto_2
    return-void
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
.end method

.method public final s()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lp3/a;->h:Li8/L;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    iget-object v0, v0, Li8/L;->a:Li8/G;

    .line 8
    .line 9
    iget-object v0, v0, Li8/G;->a:Li8/y;

    .line 10
    .line 11
    iget-object v0, v0, Li8/y;->i:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
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
