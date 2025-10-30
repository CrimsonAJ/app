.class public final LA3/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA3/J;


# instance fields
.field public final a:LA3/i;

.field public final b:LZ3/f;

.field public c:I

.field public d:I

.field public e:Ll4/x;

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:I

.field public j:I

.field public k:Z

.field public l:J


# direct methods
.method public constructor <init>(LA3/i;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LA3/w;->a:LA3/i;

    .line 5
    .line 6
    new-instance p1, LZ3/f;

    .line 7
    .line 8
    const/16 v0, 0xa

    .line 9
    .line 10
    new-array v1, v0, [B

    .line 11
    .line 12
    invoke-direct {p1, v0, v1}, LZ3/f;-><init>(I[B)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, LA3/w;->b:LZ3/f;

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput p1, p0, LA3/w;->c:I

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
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, LA3/w;->c:I

    .line 3
    .line 4
    iput v0, p0, LA3/w;->d:I

    .line 5
    .line 6
    iput-boolean v0, p0, LA3/w;->h:Z

    .line 7
    .line 8
    iget-object v0, p0, LA3/w;->a:LA3/i;

    .line 9
    .line 10
    invoke-interface {v0}, LA3/i;->a()V

    .line 11
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

.method public final b(Ll4/x;Lq3/l;LA3/I;)V
    .locals 0

    .line 1
    iput-object p1, p0, LA3/w;->e:Ll4/x;

    .line 2
    .line 3
    iget-object p1, p0, LA3/w;->a:LA3/i;

    .line 4
    .line 5
    invoke-interface {p1, p2, p3}, LA3/i;->f(Lq3/l;LA3/I;)V

    .line 6
    .line 7
    .line 8
    return-void
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

.method public final c(ILA4/r;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, LA3/w;->e:Ll4/x;

    .line 6
    .line 7
    invoke-static {v2}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    and-int/lit8 v2, p1, 0x1

    .line 11
    .line 12
    iget-object v3, v0, LA3/w;->a:LA3/i;

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x1

    .line 16
    const-string v6, "PesReader"

    .line 17
    .line 18
    const/4 v7, -0x1

    .line 19
    const/4 v8, 0x3

    .line 20
    const/4 v9, 0x2

    .line 21
    if-eqz v2, :cond_4

    .line 22
    .line 23
    iget v2, v0, LA3/w;->c:I

    .line 24
    .line 25
    if-eqz v2, :cond_3

    .line 26
    .line 27
    if-eq v2, v5, :cond_3

    .line 28
    .line 29
    if-eq v2, v9, :cond_2

    .line 30
    .line 31
    if-ne v2, v8, :cond_1

    .line 32
    .line 33
    iget v2, v0, LA3/w;->j:I

    .line 34
    .line 35
    if-eq v2, v7, :cond_0

    .line 36
    .line 37
    new-instance v2, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v10, "Unexpected start indicator: expected "

    .line 40
    .line 41
    invoke-direct {v2, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget v10, v0, LA3/w;->j:I

    .line 45
    .line 46
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v10, " more bytes"

    .line 50
    .line 51
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-static {v6, v2}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :cond_0
    invoke-interface {v3}, LA3/i;->d()V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 66
    .line 67
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 68
    .line 69
    .line 70
    throw v1

    .line 71
    :cond_2
    const-string v2, "Unexpected start indicator reading extended header"

    .line 72
    .line 73
    invoke-static {v6, v2}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    :cond_3
    :goto_0
    iput v5, v0, LA3/w;->c:I

    .line 77
    .line 78
    iput v4, v0, LA3/w;->d:I

    .line 79
    .line 80
    :cond_4
    move/from16 v2, p1

    .line 81
    .line 82
    :goto_1
    invoke-virtual {v1}, LA4/r;->e()I

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    if-lez v10, :cond_14

    .line 87
    .line 88
    iget v10, v0, LA3/w;->c:I

    .line 89
    .line 90
    if-eqz v10, :cond_13

    .line 91
    .line 92
    iget-object v11, v0, LA3/w;->b:LZ3/f;

    .line 93
    .line 94
    if-eq v10, v5, :cond_e

    .line 95
    .line 96
    if-eq v10, v9, :cond_9

    .line 97
    .line 98
    if-ne v10, v8, :cond_8

    .line 99
    .line 100
    invoke-virtual {v1}, LA4/r;->e()I

    .line 101
    .line 102
    .line 103
    move-result v10

    .line 104
    iget v11, v0, LA3/w;->j:I

    .line 105
    .line 106
    if-ne v11, v7, :cond_5

    .line 107
    .line 108
    move v11, v4

    .line 109
    goto :goto_2

    .line 110
    :cond_5
    sub-int v11, v10, v11

    .line 111
    .line 112
    :goto_2
    if-lez v11, :cond_6

    .line 113
    .line 114
    sub-int/2addr v10, v11

    .line 115
    iget v11, v1, LA4/r;->a:I

    .line 116
    .line 117
    add-int/2addr v11, v10

    .line 118
    invoke-virtual {v1, v11}, LA4/r;->G(I)V

    .line 119
    .line 120
    .line 121
    :cond_6
    invoke-interface {v3, v1}, LA3/i;->c(LA4/r;)V

    .line 122
    .line 123
    .line 124
    iget v11, v0, LA3/w;->j:I

    .line 125
    .line 126
    if-eq v11, v7, :cond_7

    .line 127
    .line 128
    sub-int/2addr v11, v10

    .line 129
    iput v11, v0, LA3/w;->j:I

    .line 130
    .line 131
    if-nez v11, :cond_7

    .line 132
    .line 133
    invoke-interface {v3}, LA3/i;->d()V

    .line 134
    .line 135
    .line 136
    iput v5, v0, LA3/w;->c:I

    .line 137
    .line 138
    iput v4, v0, LA3/w;->d:I

    .line 139
    .line 140
    :cond_7
    move v10, v8

    .line 141
    move v8, v7

    .line 142
    move v7, v10

    .line 143
    move v10, v9

    .line 144
    goto/16 :goto_6

    .line 145
    .line 146
    :cond_8
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 147
    .line 148
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 149
    .line 150
    .line 151
    throw v1

    .line 152
    :cond_9
    const/16 v10, 0xa

    .line 153
    .line 154
    iget v12, v0, LA3/w;->i:I

    .line 155
    .line 156
    invoke-static {v10, v12}, Ljava/lang/Math;->min(II)I

    .line 157
    .line 158
    .line 159
    move-result v10

    .line 160
    iget-object v12, v11, LZ3/f;->b:[B

    .line 161
    .line 162
    invoke-virtual {v0, v1, v12, v10}, LA3/w;->d(LA4/r;[BI)Z

    .line 163
    .line 164
    .line 165
    move-result v10

    .line 166
    if-eqz v10, :cond_d

    .line 167
    .line 168
    const/4 v10, 0x0

    .line 169
    iget v12, v0, LA3/w;->i:I

    .line 170
    .line 171
    invoke-virtual {v0, v1, v10, v12}, LA3/w;->d(LA4/r;[BI)Z

    .line 172
    .line 173
    .line 174
    move-result v10

    .line 175
    if-eqz v10, :cond_d

    .line 176
    .line 177
    invoke-virtual {v11, v4}, LZ3/f;->o(I)V

    .line 178
    .line 179
    .line 180
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    iput-wide v12, v0, LA3/w;->l:J

    .line 186
    .line 187
    iget-boolean v10, v0, LA3/w;->f:Z

    .line 188
    .line 189
    const/4 v12, 0x4

    .line 190
    if-eqz v10, :cond_b

    .line 191
    .line 192
    invoke-virtual {v11, v12}, LZ3/f;->r(I)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v11, v8}, LZ3/f;->i(I)I

    .line 196
    .line 197
    .line 198
    move-result v10

    .line 199
    int-to-long v13, v10

    .line 200
    const/16 v10, 0x1e

    .line 201
    .line 202
    shl-long/2addr v13, v10

    .line 203
    invoke-virtual {v11, v5}, LZ3/f;->r(I)V

    .line 204
    .line 205
    .line 206
    const/16 v15, 0xf

    .line 207
    .line 208
    invoke-virtual {v11, v15}, LZ3/f;->i(I)I

    .line 209
    .line 210
    .line 211
    move-result v16

    .line 212
    move/from16 p1, v10

    .line 213
    .line 214
    shl-int/lit8 v10, v16, 0xf

    .line 215
    .line 216
    int-to-long v9, v10

    .line 217
    or-long/2addr v9, v13

    .line 218
    invoke-virtual {v11, v5}, LZ3/f;->r(I)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v11, v15}, LZ3/f;->i(I)I

    .line 222
    .line 223
    .line 224
    move-result v13

    .line 225
    int-to-long v13, v13

    .line 226
    or-long/2addr v9, v13

    .line 227
    invoke-virtual {v11, v5}, LZ3/f;->r(I)V

    .line 228
    .line 229
    .line 230
    iget-boolean v13, v0, LA3/w;->h:Z

    .line 231
    .line 232
    if-nez v13, :cond_a

    .line 233
    .line 234
    iget-boolean v13, v0, LA3/w;->g:Z

    .line 235
    .line 236
    if-eqz v13, :cond_a

    .line 237
    .line 238
    invoke-virtual {v11, v12}, LZ3/f;->r(I)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v11, v8}, LZ3/f;->i(I)I

    .line 242
    .line 243
    .line 244
    move-result v13

    .line 245
    int-to-long v13, v13

    .line 246
    shl-long v13, v13, p1

    .line 247
    .line 248
    invoke-virtual {v11, v5}, LZ3/f;->r(I)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v11, v15}, LZ3/f;->i(I)I

    .line 252
    .line 253
    .line 254
    move-result v17

    .line 255
    shl-int/lit8 v12, v17, 0xf

    .line 256
    .line 257
    int-to-long v7, v12

    .line 258
    or-long/2addr v7, v13

    .line 259
    invoke-virtual {v11, v5}, LZ3/f;->r(I)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v11, v15}, LZ3/f;->i(I)I

    .line 263
    .line 264
    .line 265
    move-result v12

    .line 266
    int-to-long v12, v12

    .line 267
    or-long/2addr v7, v12

    .line 268
    invoke-virtual {v11, v5}, LZ3/f;->r(I)V

    .line 269
    .line 270
    .line 271
    iget-object v11, v0, LA3/w;->e:Ll4/x;

    .line 272
    .line 273
    invoke-virtual {v11, v7, v8}, Ll4/x;->b(J)J

    .line 274
    .line 275
    .line 276
    iput-boolean v5, v0, LA3/w;->h:Z

    .line 277
    .line 278
    :cond_a
    iget-object v7, v0, LA3/w;->e:Ll4/x;

    .line 279
    .line 280
    invoke-virtual {v7, v9, v10}, Ll4/x;->b(J)J

    .line 281
    .line 282
    .line 283
    move-result-wide v7

    .line 284
    iput-wide v7, v0, LA3/w;->l:J

    .line 285
    .line 286
    :cond_b
    iget-boolean v7, v0, LA3/w;->k:Z

    .line 287
    .line 288
    if-eqz v7, :cond_c

    .line 289
    .line 290
    const/4 v12, 0x4

    .line 291
    goto :goto_3

    .line 292
    :cond_c
    move v12, v4

    .line 293
    :goto_3
    or-int/2addr v2, v12

    .line 294
    iget-wide v7, v0, LA3/w;->l:J

    .line 295
    .line 296
    invoke-interface {v3, v7, v8, v2}, LA3/i;->e(JI)V

    .line 297
    .line 298
    .line 299
    const/4 v7, 0x3

    .line 300
    iput v7, v0, LA3/w;->c:I

    .line 301
    .line 302
    iput v4, v0, LA3/w;->d:I

    .line 303
    .line 304
    move v8, v7

    .line 305
    const/4 v7, -0x1

    .line 306
    const/4 v9, 0x2

    .line 307
    goto/16 :goto_1

    .line 308
    .line 309
    :cond_d
    move v7, v8

    .line 310
    move v10, v9

    .line 311
    const/4 v8, -0x1

    .line 312
    goto/16 :goto_6

    .line 313
    .line 314
    :cond_e
    move v7, v8

    .line 315
    iget-object v8, v11, LZ3/f;->b:[B

    .line 316
    .line 317
    const/16 v9, 0x9

    .line 318
    .line 319
    invoke-virtual {v0, v1, v8, v9}, LA3/w;->d(LA4/r;[BI)Z

    .line 320
    .line 321
    .line 322
    move-result v8

    .line 323
    if-eqz v8, :cond_12

    .line 324
    .line 325
    invoke-virtual {v11, v4}, LZ3/f;->o(I)V

    .line 326
    .line 327
    .line 328
    const/16 v8, 0x18

    .line 329
    .line 330
    invoke-virtual {v11, v8}, LZ3/f;->i(I)I

    .line 331
    .line 332
    .line 333
    move-result v8

    .line 334
    if-eq v8, v5, :cond_f

    .line 335
    .line 336
    const-string v9, "Unexpected start code prefix: "

    .line 337
    .line 338
    invoke-static {v9, v8, v6}, Lcom/google/android/gms/internal/measurement/k1;->v(Ljava/lang/String;ILjava/lang/String;)V

    .line 339
    .line 340
    .line 341
    const/4 v8, -0x1

    .line 342
    iput v8, v0, LA3/w;->j:I

    .line 343
    .line 344
    move v9, v4

    .line 345
    const/4 v8, -0x1

    .line 346
    const/4 v10, 0x2

    .line 347
    goto :goto_5

    .line 348
    :cond_f
    const/16 v8, 0x8

    .line 349
    .line 350
    invoke-virtual {v11, v8}, LZ3/f;->r(I)V

    .line 351
    .line 352
    .line 353
    const/16 v9, 0x10

    .line 354
    .line 355
    invoke-virtual {v11, v9}, LZ3/f;->i(I)I

    .line 356
    .line 357
    .line 358
    move-result v9

    .line 359
    const/4 v10, 0x5

    .line 360
    invoke-virtual {v11, v10}, LZ3/f;->r(I)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v11}, LZ3/f;->h()Z

    .line 364
    .line 365
    .line 366
    move-result v10

    .line 367
    iput-boolean v10, v0, LA3/w;->k:Z

    .line 368
    .line 369
    const/4 v10, 0x2

    .line 370
    invoke-virtual {v11, v10}, LZ3/f;->r(I)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v11}, LZ3/f;->h()Z

    .line 374
    .line 375
    .line 376
    move-result v12

    .line 377
    iput-boolean v12, v0, LA3/w;->f:Z

    .line 378
    .line 379
    invoke-virtual {v11}, LZ3/f;->h()Z

    .line 380
    .line 381
    .line 382
    move-result v12

    .line 383
    iput-boolean v12, v0, LA3/w;->g:Z

    .line 384
    .line 385
    const/4 v12, 0x6

    .line 386
    invoke-virtual {v11, v12}, LZ3/f;->r(I)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v11, v8}, LZ3/f;->i(I)I

    .line 390
    .line 391
    .line 392
    move-result v8

    .line 393
    iput v8, v0, LA3/w;->i:I

    .line 394
    .line 395
    if-nez v9, :cond_10

    .line 396
    .line 397
    const/4 v11, -0x1

    .line 398
    iput v11, v0, LA3/w;->j:I

    .line 399
    .line 400
    move v8, v11

    .line 401
    goto :goto_4

    .line 402
    :cond_10
    add-int/lit8 v9, v9, -0x3

    .line 403
    .line 404
    sub-int/2addr v9, v8

    .line 405
    iput v9, v0, LA3/w;->j:I

    .line 406
    .line 407
    if-gez v9, :cond_11

    .line 408
    .line 409
    new-instance v8, Ljava/lang/StringBuilder;

    .line 410
    .line 411
    const-string v9, "Found negative packet payload size: "

    .line 412
    .line 413
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    iget v9, v0, LA3/w;->j:I

    .line 417
    .line 418
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v8

    .line 425
    invoke-static {v6, v8}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    const/4 v8, -0x1

    .line 429
    iput v8, v0, LA3/w;->j:I

    .line 430
    .line 431
    goto :goto_4

    .line 432
    :cond_11
    const/4 v8, -0x1

    .line 433
    :goto_4
    move v9, v10

    .line 434
    :goto_5
    iput v9, v0, LA3/w;->c:I

    .line 435
    .line 436
    iput v4, v0, LA3/w;->d:I

    .line 437
    .line 438
    goto :goto_6

    .line 439
    :cond_12
    const/4 v8, -0x1

    .line 440
    const/4 v10, 0x2

    .line 441
    goto :goto_6

    .line 442
    :cond_13
    move v10, v8

    .line 443
    move v8, v7

    .line 444
    move v7, v10

    .line 445
    move v10, v9

    .line 446
    invoke-virtual {v1}, LA4/r;->e()I

    .line 447
    .line 448
    .line 449
    move-result v9

    .line 450
    invoke-virtual {v1, v9}, LA4/r;->I(I)V

    .line 451
    .line 452
    .line 453
    :goto_6
    move v9, v8

    .line 454
    move v8, v7

    .line 455
    move v7, v9

    .line 456
    move v9, v10

    .line 457
    goto/16 :goto_1

    .line 458
    .line 459
    :cond_14
    return-void
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
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
.end method

.method public final d(LA4/r;[BI)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, LA4/r;->e()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, LA3/w;->d:I

    .line 6
    .line 7
    sub-int v1, p3, v1

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    if-gtz v0, :cond_0

    .line 15
    .line 16
    return v1

    .line 17
    :cond_0
    if-nez p2, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1, v0}, LA4/r;->I(I)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget v2, p0, LA3/w;->d:I

    .line 24
    .line 25
    invoke-virtual {p1, p2, v2, v0}, LA4/r;->h([BII)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget p1, p0, LA3/w;->d:I

    .line 29
    .line 30
    add-int/2addr p1, v0

    .line 31
    iput p1, p0, LA3/w;->d:I

    .line 32
    .line 33
    if-ne p1, p3, :cond_2

    .line 34
    .line 35
    return v1

    .line 36
    :cond_2
    const/4 p1, 0x0

    .line 37
    return p1
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
