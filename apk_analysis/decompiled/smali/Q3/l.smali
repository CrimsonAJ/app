.class public final LQ3/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP3/h;


# instance fields
.field public final a:Lk4/N;

.field public final b:Lcom/google/firebase/messaging/s;

.field public final c:[I

.field public final d:I

.field public final e:Lk4/m;

.field public final f:J

.field public final g:LQ3/o;

.field public final h:[LQ3/j;

.field public i:Li4/q;

.field public j:LR3/c;

.field public k:I

.field public l:LN3/b;

.field public m:Z


# direct methods
.method public constructor <init>(Lk4/N;LR3/c;Lcom/google/firebase/messaging/s;I[ILi4/q;ILk4/m;JZLjava/util/ArrayList;LQ3/o;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move/from16 v3, p4

    .line 8
    .line 9
    move-object/from16 v4, p6

    .line 10
    .line 11
    move/from16 v5, p7

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    move-object/from16 v6, p1

    .line 17
    .line 18
    iput-object v6, v0, LQ3/l;->a:Lk4/N;

    .line 19
    .line 20
    iput-object v1, v0, LQ3/l;->j:LR3/c;

    .line 21
    .line 22
    iput-object v2, v0, LQ3/l;->b:Lcom/google/firebase/messaging/s;

    .line 23
    .line 24
    move-object/from16 v6, p5

    .line 25
    .line 26
    iput-object v6, v0, LQ3/l;->c:[I

    .line 27
    .line 28
    iput-object v4, v0, LQ3/l;->i:Li4/q;

    .line 29
    .line 30
    iput v5, v0, LQ3/l;->d:I

    .line 31
    .line 32
    move-object/from16 v6, p8

    .line 33
    .line 34
    iput-object v6, v0, LQ3/l;->e:Lk4/m;

    .line 35
    .line 36
    iput v3, v0, LQ3/l;->k:I

    .line 37
    .line 38
    move-wide/from16 v6, p9

    .line 39
    .line 40
    iput-wide v6, v0, LQ3/l;->f:J

    .line 41
    .line 42
    move-object/from16 v11, p13

    .line 43
    .line 44
    iput-object v11, v0, LQ3/l;->g:LQ3/o;

    .line 45
    .line 46
    invoke-virtual {v1, v3}, LR3/c;->d(I)J

    .line 47
    .line 48
    .line 49
    move-result-wide v12

    .line 50
    invoke-virtual {v0}, LQ3/l;->i()Ljava/util/ArrayList;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-interface {v4}, Li4/q;->length()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    new-array v3, v3, [LQ3/j;

    .line 59
    .line 60
    iput-object v3, v0, LQ3/l;->h:[LQ3/j;

    .line 61
    .line 62
    const/4 v3, 0x0

    .line 63
    move v15, v3

    .line 64
    :goto_0
    iget-object v6, v0, LQ3/l;->h:[LQ3/j;

    .line 65
    .line 66
    array-length v6, v6

    .line 67
    if-ge v15, v6, :cond_6

    .line 68
    .line 69
    invoke-interface {v4, v15}, Li4/q;->e(I)I

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    move-object v14, v6

    .line 78
    check-cast v14, LR3/m;

    .line 79
    .line 80
    iget-object v6, v14, LR3/m;->b:LP5/F;

    .line 81
    .line 82
    invoke-virtual {v2, v6}, Lcom/google/firebase/messaging/s;->t(Ljava/util/List;)LR3/b;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    iget-object v7, v0, LQ3/l;->h:[LQ3/j;

    .line 87
    .line 88
    new-instance v16, LQ3/j;

    .line 89
    .line 90
    if-eqz v6, :cond_0

    .line 91
    .line 92
    :goto_1
    move-object/from16 v17, v6

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_0
    iget-object v6, v14, LR3/m;->b:LP5/F;

    .line 96
    .line 97
    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    check-cast v6, LR3/b;

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :goto_2
    iget-object v6, v14, LR3/m;->a:Lj3/M;

    .line 105
    .line 106
    iget-object v8, v6, Lj3/M;->k:Ljava/lang/String;

    .line 107
    .line 108
    invoke-static {v8}, Ll4/n;->k(Ljava/lang/String;)Z

    .line 109
    .line 110
    .line 111
    move-result v9

    .line 112
    if-eqz v9, :cond_1

    .line 113
    .line 114
    const/4 v6, 0x0

    .line 115
    move-object v11, v6

    .line 116
    move-object/from16 v18, v7

    .line 117
    .line 118
    :goto_3
    move-wide v7, v12

    .line 119
    goto/16 :goto_9

    .line 120
    .line 121
    :cond_1
    if-nez v8, :cond_2

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_2
    const-string v9, "video/webm"

    .line 125
    .line 126
    invoke-virtual {v8, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 127
    .line 128
    .line 129
    move-result v9

    .line 130
    if-nez v9, :cond_3

    .line 131
    .line 132
    const-string v9, "audio/webm"

    .line 133
    .line 134
    invoke-virtual {v8, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 135
    .line 136
    .line 137
    move-result v9

    .line 138
    if-nez v9, :cond_3

    .line 139
    .line 140
    const-string v9, "application/webm"

    .line 141
    .line 142
    invoke-virtual {v8, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 143
    .line 144
    .line 145
    move-result v9

    .line 146
    if-nez v9, :cond_3

    .line 147
    .line 148
    const-string v9, "video/x-matroska"

    .line 149
    .line 150
    invoke-virtual {v8, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 151
    .line 152
    .line 153
    move-result v9

    .line 154
    if-nez v9, :cond_3

    .line 155
    .line 156
    const-string v9, "audio/x-matroska"

    .line 157
    .line 158
    invoke-virtual {v8, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 159
    .line 160
    .line 161
    move-result v9

    .line 162
    if-nez v9, :cond_3

    .line 163
    .line 164
    const-string v9, "application/x-matroska"

    .line 165
    .line 166
    invoke-virtual {v8, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 167
    .line 168
    .line 169
    move-result v8

    .line 170
    if-eqz v8, :cond_4

    .line 171
    .line 172
    :cond_3
    move-object v3, v6

    .line 173
    move-object/from16 v18, v7

    .line 174
    .line 175
    goto :goto_7

    .line 176
    :cond_4
    :goto_4
    if-eqz p11, :cond_5

    .line 177
    .line 178
    const/4 v8, 0x4

    .line 179
    :goto_5
    move-object v9, v6

    .line 180
    goto :goto_6

    .line 181
    :cond_5
    move v8, v3

    .line 182
    goto :goto_5

    .line 183
    :goto_6
    new-instance v6, Ly3/i;

    .line 184
    .line 185
    move-object v10, v7

    .line 186
    move v7, v8

    .line 187
    const/4 v8, 0x0

    .line 188
    move-object/from16 v18, v9

    .line 189
    .line 190
    const/4 v9, 0x0

    .line 191
    move-object/from16 v3, v18

    .line 192
    .line 193
    move-object/from16 v18, v10

    .line 194
    .line 195
    move-object/from16 v10, p12

    .line 196
    .line 197
    invoke-direct/range {v6 .. v11}, Ly3/i;-><init>(ILl4/x;Ly3/o;Ljava/util/List;LQ3/o;)V

    .line 198
    .line 199
    .line 200
    goto :goto_8

    .line 201
    :goto_7
    new-instance v6, Lw3/d;

    .line 202
    .line 203
    const/4 v7, 0x1

    .line 204
    invoke-direct {v6, v7}, Lw3/d;-><init>(I)V

    .line 205
    .line 206
    .line 207
    :goto_8
    new-instance v7, LP3/d;

    .line 208
    .line 209
    invoke-direct {v7, v6, v5, v3}, LP3/d;-><init>(Lq3/j;ILj3/M;)V

    .line 210
    .line 211
    .line 212
    move-object v11, v7

    .line 213
    goto :goto_3

    .line 214
    :goto_9
    const-wide/16 v12, 0x0

    .line 215
    .line 216
    move-object v9, v14

    .line 217
    invoke-virtual {v9}, LR3/m;->b()LQ3/i;

    .line 218
    .line 219
    .line 220
    move-result-object v14

    .line 221
    move-object/from16 v6, v16

    .line 222
    .line 223
    move-object/from16 v10, v17

    .line 224
    .line 225
    invoke-direct/range {v6 .. v14}, LQ3/j;-><init>(JLR3/m;LR3/b;LP3/d;JLQ3/i;)V

    .line 226
    .line 227
    .line 228
    aput-object v6, v18, v15

    .line 229
    .line 230
    add-int/lit8 v15, v15, 0x1

    .line 231
    .line 232
    move-object/from16 v11, p13

    .line 233
    .line 234
    move-wide v12, v7

    .line 235
    const/4 v3, 0x0

    .line 236
    goto/16 :goto_0

    .line 237
    .line 238
    :cond_6
    return-void
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
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, LQ3/l;->h:[LQ3/j;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_1

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    iget-object v3, v3, LQ3/j;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, LP3/d;

    .line 12
    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    iget-object v3, v3, LP3/d;->a:Lq3/j;

    .line 16
    .line 17
    invoke-interface {v3}, Lq3/j;->a()V

    .line 18
    .line 19
    .line 20
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    return-void
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

.method public final b()V
    .locals 1

    .line 1
    iget-object v0, p0, LQ3/l;->l:LN3/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LQ3/l;->a:Lk4/N;

    .line 6
    .line 7
    invoke-interface {v0}, Lk4/N;->b()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    throw v0
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

.method public final c(JLj3/x0;)J
    .locals 18

    .line 1
    move-wide/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v7, p0

    .line 4
    .line 5
    iget-object v0, v7, LQ3/l;->h:[LQ3/j;

    .line 6
    .line 7
    array-length v3, v0

    .line 8
    const/4 v4, 0x0

    .line 9
    :goto_0
    if-ge v4, v3, :cond_3

    .line 10
    .line 11
    aget-object v5, v0, v4

    .line 12
    .line 13
    iget-object v6, v5, LQ3/j;->g:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v6, LQ3/i;

    .line 16
    .line 17
    if-eqz v6, :cond_2

    .line 18
    .line 19
    iget-wide v3, v5, LQ3/j;->b:J

    .line 20
    .line 21
    invoke-interface {v6, v1, v2, v3, v4}, LQ3/i;->d(JJ)J

    .line 22
    .line 23
    .line 24
    move-result-wide v8

    .line 25
    iget-wide v10, v5, LQ3/j;->c:J

    .line 26
    .line 27
    add-long/2addr v8, v10

    .line 28
    invoke-virtual {v5, v8, v9}, LQ3/j;->d(J)J

    .line 29
    .line 30
    .line 31
    move-result-wide v12

    .line 32
    iget-object v0, v5, LQ3/j;->g:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, LQ3/i;

    .line 35
    .line 36
    invoke-interface {v0, v3, v4}, LQ3/i;->z(J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v3

    .line 40
    cmp-long v6, v12, v1

    .line 41
    .line 42
    if-gez v6, :cond_1

    .line 43
    .line 44
    const-wide/16 v14, -0x1

    .line 45
    .line 46
    cmp-long v6, v3, v14

    .line 47
    .line 48
    const-wide/16 v14, 0x1

    .line 49
    .line 50
    if-eqz v6, :cond_0

    .line 51
    .line 52
    invoke-interface {v0}, LQ3/i;->v()J

    .line 53
    .line 54
    .line 55
    move-result-wide v16

    .line 56
    add-long v16, v16, v10

    .line 57
    .line 58
    add-long v16, v16, v3

    .line 59
    .line 60
    sub-long v16, v16, v14

    .line 61
    .line 62
    cmp-long v0, v8, v16

    .line 63
    .line 64
    if-gez v0, :cond_1

    .line 65
    .line 66
    :cond_0
    add-long/2addr v8, v14

    .line 67
    invoke-virtual {v5, v8, v9}, LQ3/j;->d(J)J

    .line 68
    .line 69
    .line 70
    move-result-wide v3

    .line 71
    move-wide v5, v3

    .line 72
    move-wide v3, v12

    .line 73
    :goto_1
    move-object/from16 v0, p3

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_1
    move-wide v3, v12

    .line 77
    move-wide v5, v3

    .line 78
    goto :goto_1

    .line 79
    :goto_2
    invoke-virtual/range {v0 .. v6}, Lj3/x0;->a(JJJ)J

    .line 80
    .line 81
    .line 82
    move-result-wide v0

    .line 83
    return-wide v0

    .line 84
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 85
    .line 86
    move-wide/from16 v1, p1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_3
    return-wide p1
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

.method public final d(JLP3/e;Ljava/util/List;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LQ3/l;->l:LN3/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    iget-object v0, p0, LQ3/l;->i:Li4/q;

    .line 8
    .line 9
    invoke-interface {v0, p1, p2, p3, p4}, Li4/q;->n(JLP3/e;Ljava/util/List;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
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

.method public final e(LP3/e;)V
    .locals 13

    .line 1
    instance-of v0, p1, LP3/j;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, LP3/j;

    .line 7
    .line 8
    iget-object v1, p0, LQ3/l;->i:Li4/q;

    .line 9
    .line 10
    iget-object v0, v0, LP3/e;->d:Lj3/M;

    .line 11
    .line 12
    invoke-interface {v1, v0}, Li4/q;->k(Lj3/M;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v1, p0, LQ3/l;->h:[LQ3/j;

    .line 17
    .line 18
    aget-object v2, v1, v0

    .line 19
    .line 20
    iget-object v3, v2, LQ3/j;->g:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v3, LQ3/i;

    .line 23
    .line 24
    if-nez v3, :cond_1

    .line 25
    .line 26
    iget-object v3, v2, LQ3/j;->d:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v9, v3

    .line 29
    check-cast v9, LP3/d;

    .line 30
    .line 31
    iget-object v3, v9, LP3/d;->h:Lq3/r;

    .line 32
    .line 33
    instance-of v4, v3, Lq3/f;

    .line 34
    .line 35
    if-eqz v4, :cond_0

    .line 36
    .line 37
    check-cast v3, Lq3/f;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/4 v3, 0x0

    .line 41
    :goto_0
    if-eqz v3, :cond_1

    .line 42
    .line 43
    new-instance v12, LF0/h;

    .line 44
    .line 45
    iget-object v4, v2, LQ3/j;->e:Ljava/lang/Object;

    .line 46
    .line 47
    move-object v7, v4

    .line 48
    check-cast v7, LR3/m;

    .line 49
    .line 50
    iget-wide v4, v7, LR3/m;->c:J

    .line 51
    .line 52
    const/4 v6, 0x1

    .line 53
    invoke-direct {v12, v6, v4, v5, v3}, LF0/h;-><init>(IJLjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    new-instance v4, LQ3/j;

    .line 57
    .line 58
    iget-object v3, v2, LQ3/j;->f:Ljava/lang/Object;

    .line 59
    .line 60
    move-object v8, v3

    .line 61
    check-cast v8, LR3/b;

    .line 62
    .line 63
    iget-wide v10, v2, LQ3/j;->c:J

    .line 64
    .line 65
    iget-wide v5, v2, LQ3/j;->b:J

    .line 66
    .line 67
    invoke-direct/range {v4 .. v12}, LQ3/j;-><init>(JLR3/m;LR3/b;LP3/d;JLQ3/i;)V

    .line 68
    .line 69
    .line 70
    aput-object v4, v1, v0

    .line 71
    .line 72
    :cond_1
    iget-object v0, p0, LQ3/l;->g:LQ3/o;

    .line 73
    .line 74
    if-eqz v0, :cond_4

    .line 75
    .line 76
    iget-wide v1, v0, LQ3/o;->d:J

    .line 77
    .line 78
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    cmp-long v3, v1, v3

    .line 84
    .line 85
    if-eqz v3, :cond_2

    .line 86
    .line 87
    iget-wide v3, p1, LP3/e;->h:J

    .line 88
    .line 89
    cmp-long v1, v3, v1

    .line 90
    .line 91
    if-lez v1, :cond_3

    .line 92
    .line 93
    :cond_2
    iget-wide v1, p1, LP3/e;->h:J

    .line 94
    .line 95
    iput-wide v1, v0, LQ3/o;->d:J

    .line 96
    .line 97
    :cond_3
    const/4 p1, 0x1

    .line 98
    iget-object v0, v0, LQ3/o;->e:LQ3/p;

    .line 99
    .line 100
    iput-boolean p1, v0, LQ3/p;->g:Z

    .line 101
    .line 102
    :cond_4
    return-void
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
.end method

.method public final f(JLjava/util/List;)I
    .locals 2

    .line 1
    iget-object v0, p0, LQ3/l;->l:LN3/b;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, LQ3/l;->i:Li4/q;

    .line 6
    .line 7
    invoke-interface {v0}, Li4/q;->length()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x2

    .line 12
    if-ge v0, v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, LQ3/l;->i:Li4/q;

    .line 16
    .line 17
    invoke-interface {v0, p1, p2, p3}, Li4/q;->f(JLjava/util/List;)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1

    .line 22
    :cond_1
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1
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

.method public final g(JJLjava/util/List;LA6/i;)V
    .locals 54

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v3, p6

    .line 6
    .line 7
    iget-object v4, v0, LQ3/l;->l:LN3/b;

    .line 8
    .line 9
    if-eqz v4, :cond_0

    .line 10
    .line 11
    goto/16 :goto_3

    .line 12
    .line 13
    :cond_0
    sub-long v8, v1, p1

    .line 14
    .line 15
    iget-object v4, v0, LQ3/l;->j:LR3/c;

    .line 16
    .line 17
    iget-wide v4, v4, LR3/c;->a:J

    .line 18
    .line 19
    invoke-static {v4, v5}, Ll4/y;->H(J)J

    .line 20
    .line 21
    .line 22
    move-result-wide v4

    .line 23
    iget-object v6, v0, LQ3/l;->j:LR3/c;

    .line 24
    .line 25
    iget v7, v0, LQ3/l;->k:I

    .line 26
    .line 27
    invoke-virtual {v6, v7}, LR3/c;->b(I)LR3/h;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    iget-wide v6, v6, LR3/h;->b:J

    .line 32
    .line 33
    invoke-static {v6, v7}, Ll4/y;->H(J)J

    .line 34
    .line 35
    .line 36
    move-result-wide v6

    .line 37
    add-long/2addr v6, v4

    .line 38
    add-long/2addr v6, v1

    .line 39
    const/4 v4, 0x0

    .line 40
    const/4 v5, 0x1

    .line 41
    iget-object v10, v0, LQ3/l;->g:LQ3/o;

    .line 42
    .line 43
    if-eqz v10, :cond_8

    .line 44
    .line 45
    iget-object v10, v10, LQ3/o;->e:LQ3/p;

    .line 46
    .line 47
    iget-object v11, v10, LQ3/p;->f:LR3/c;

    .line 48
    .line 49
    iget-boolean v12, v11, LR3/c;->d:Z

    .line 50
    .line 51
    if-nez v12, :cond_1

    .line 52
    .line 53
    move v6, v4

    .line 54
    :goto_0
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_1
    iget-boolean v12, v10, LQ3/p;->h:Z

    .line 61
    .line 62
    if-eqz v12, :cond_2

    .line 63
    .line 64
    move v6, v5

    .line 65
    goto :goto_0

    .line 66
    :cond_2
    iget-object v12, v10, LQ3/p;->e:Ljava/util/TreeMap;

    .line 67
    .line 68
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    iget-wide v14, v11, LR3/c;->h:J

    .line 74
    .line 75
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 76
    .line 77
    .line 78
    move-result-object v11

    .line 79
    invoke-virtual {v12, v11}, Ljava/util/TreeMap;->ceilingEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    .line 80
    .line 81
    .line 82
    move-result-object v11

    .line 83
    iget-object v12, v10, LQ3/p;->b:LQ3/f;

    .line 84
    .line 85
    if-eqz v11, :cond_5

    .line 86
    .line 87
    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v13

    .line 91
    check-cast v13, Ljava/lang/Long;

    .line 92
    .line 93
    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    .line 94
    .line 95
    .line 96
    move-result-wide v13

    .line 97
    cmp-long v6, v13, v6

    .line 98
    .line 99
    if-gez v6, :cond_5

    .line 100
    .line 101
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    check-cast v6, Ljava/lang/Long;

    .line 106
    .line 107
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 108
    .line 109
    .line 110
    move-result-wide v6

    .line 111
    iget-object v11, v12, LQ3/f;->a:LQ3/h;

    .line 112
    .line 113
    iget-wide v13, v11, LQ3/h;->l0:J

    .line 114
    .line 115
    cmp-long v15, v13, v16

    .line 116
    .line 117
    if-eqz v15, :cond_3

    .line 118
    .line 119
    cmp-long v13, v13, v6

    .line 120
    .line 121
    if-gez v13, :cond_4

    .line 122
    .line 123
    :cond_3
    iput-wide v6, v11, LQ3/h;->l0:J

    .line 124
    .line 125
    :cond_4
    move v6, v5

    .line 126
    goto :goto_1

    .line 127
    :cond_5
    move v6, v4

    .line 128
    :goto_1
    if-eqz v6, :cond_7

    .line 129
    .line 130
    iget-boolean v7, v10, LQ3/p;->g:Z

    .line 131
    .line 132
    if-nez v7, :cond_6

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_6
    iput-boolean v5, v10, LQ3/p;->h:Z

    .line 136
    .line 137
    iput-boolean v4, v10, LQ3/p;->g:Z

    .line 138
    .line 139
    iget-object v7, v12, LQ3/f;->a:LQ3/h;

    .line 140
    .line 141
    iget-object v10, v7, LQ3/h;->D:Landroid/os/Handler;

    .line 142
    .line 143
    iget-object v11, v7, LQ3/h;->w:LQ3/c;

    .line 144
    .line 145
    invoke-virtual {v10, v11}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v7}, LQ3/h;->y()V

    .line 149
    .line 150
    .line 151
    :cond_7
    :goto_2
    if-eqz v6, :cond_9

    .line 152
    .line 153
    :goto_3
    return-void

    .line 154
    :cond_8
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    :cond_9
    iget-wide v6, v0, LQ3/l;->f:J

    .line 160
    .line 161
    invoke-static {v6, v7}, Ll4/y;->v(J)J

    .line 162
    .line 163
    .line 164
    move-result-wide v6

    .line 165
    invoke-static {v6, v7}, Ll4/y;->H(J)J

    .line 166
    .line 167
    .line 168
    move-result-wide v14

    .line 169
    iget-object v6, v0, LQ3/l;->j:LR3/c;

    .line 170
    .line 171
    iget-wide v10, v6, LR3/c;->a:J

    .line 172
    .line 173
    cmp-long v7, v10, v16

    .line 174
    .line 175
    if-nez v7, :cond_a

    .line 176
    .line 177
    move-wide/from16 v18, v16

    .line 178
    .line 179
    goto :goto_4

    .line 180
    :cond_a
    iget v7, v0, LQ3/l;->k:I

    .line 181
    .line 182
    invoke-virtual {v6, v7}, LR3/c;->b(I)LR3/h;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    iget-wide v6, v6, LR3/h;->b:J

    .line 187
    .line 188
    add-long/2addr v10, v6

    .line 189
    invoke-static {v10, v11}, Ll4/y;->H(J)J

    .line 190
    .line 191
    .line 192
    move-result-wide v6

    .line 193
    sub-long v6, v14, v6

    .line 194
    .line 195
    move-wide/from16 v18, v6

    .line 196
    .line 197
    :goto_4
    invoke-interface/range {p5 .. p5}, Ljava/util/List;->isEmpty()Z

    .line 198
    .line 199
    .line 200
    move-result v6

    .line 201
    const/16 v20, 0x0

    .line 202
    .line 203
    if-eqz v6, :cond_b

    .line 204
    .line 205
    move-object/from16 v12, p5

    .line 206
    .line 207
    move-object/from16 v21, v20

    .line 208
    .line 209
    goto :goto_5

    .line 210
    :cond_b
    invoke-interface/range {p5 .. p5}, Ljava/util/List;->size()I

    .line 211
    .line 212
    .line 213
    move-result v6

    .line 214
    sub-int/2addr v6, v5

    .line 215
    move-object/from16 v12, p5

    .line 216
    .line 217
    invoke-interface {v12, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v6

    .line 221
    check-cast v6, LP3/k;

    .line 222
    .line 223
    move-object/from16 v21, v6

    .line 224
    .line 225
    :goto_5
    iget-object v6, v0, LQ3/l;->i:Li4/q;

    .line 226
    .line 227
    invoke-interface {v6}, Li4/q;->length()I

    .line 228
    .line 229
    .line 230
    move-result v6

    .line 231
    new-array v13, v6, [LP3/l;

    .line 232
    .line 233
    move v7, v4

    .line 234
    :goto_6
    iget-object v10, v0, LQ3/l;->h:[LQ3/j;

    .line 235
    .line 236
    if-ge v7, v6, :cond_f

    .line 237
    .line 238
    aget-object v10, v10, v7

    .line 239
    .line 240
    iget-object v11, v10, LQ3/j;->g:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v11, LQ3/i;

    .line 243
    .line 244
    sget-object v22, LP3/l;->F:LF5/e;

    .line 245
    .line 246
    if-nez v11, :cond_c

    .line 247
    .line 248
    aput-object v22, v13, v7

    .line 249
    .line 250
    move/from16 v27, v4

    .line 251
    .line 252
    move/from16 v24, v6

    .line 253
    .line 254
    goto :goto_9

    .line 255
    :cond_c
    move/from16 v24, v6

    .line 256
    .line 257
    iget-wide v5, v10, LQ3/j;->b:J

    .line 258
    .line 259
    invoke-interface {v11, v5, v6, v14, v15}, LQ3/i;->k(JJ)J

    .line 260
    .line 261
    .line 262
    move-result-wide v25

    .line 263
    move/from16 v27, v4

    .line 264
    .line 265
    move-wide/from16 v28, v5

    .line 266
    .line 267
    iget-wide v4, v10, LQ3/j;->c:J

    .line 268
    .line 269
    add-long v32, v25, v4

    .line 270
    .line 271
    invoke-virtual {v10, v14, v15}, LQ3/j;->b(J)J

    .line 272
    .line 273
    .line 274
    move-result-wide v34

    .line 275
    if-eqz v21, :cond_d

    .line 276
    .line 277
    invoke-virtual/range {v21 .. v21}, LP3/k;->b()J

    .line 278
    .line 279
    .line 280
    move-result-wide v4

    .line 281
    :goto_7
    move-wide/from16 v36, v4

    .line 282
    .line 283
    goto :goto_8

    .line 284
    :cond_d
    iget-object v6, v10, LQ3/j;->g:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast v6, LQ3/i;

    .line 287
    .line 288
    move-wide/from16 v10, v28

    .line 289
    .line 290
    invoke-interface {v6, v1, v2, v10, v11}, LQ3/i;->d(JJ)J

    .line 291
    .line 292
    .line 293
    move-result-wide v10

    .line 294
    add-long v30, v10, v4

    .line 295
    .line 296
    invoke-static/range {v30 .. v35}, Ll4/y;->j(JJJ)J

    .line 297
    .line 298
    .line 299
    move-result-wide v4

    .line 300
    goto :goto_7

    .line 301
    :goto_8
    cmp-long v4, v36, v32

    .line 302
    .line 303
    if-gez v4, :cond_e

    .line 304
    .line 305
    aput-object v22, v13, v7

    .line 306
    .line 307
    goto :goto_9

    .line 308
    :cond_e
    move-wide/from16 v38, v34

    .line 309
    .line 310
    invoke-virtual {v0, v7}, LQ3/l;->j(I)LQ3/j;

    .line 311
    .line 312
    .line 313
    move-result-object v35

    .line 314
    new-instance v34, LQ3/k;

    .line 315
    .line 316
    invoke-direct/range {v34 .. v39}, LQ3/k;-><init>(LQ3/j;JJ)V

    .line 317
    .line 318
    .line 319
    aput-object v34, v13, v7

    .line 320
    .line 321
    :goto_9
    add-int/lit8 v7, v7, 0x1

    .line 322
    .line 323
    move/from16 v6, v24

    .line 324
    .line 325
    move/from16 v4, v27

    .line 326
    .line 327
    const/4 v5, 0x1

    .line 328
    goto :goto_6

    .line 329
    :cond_f
    move/from16 v27, v4

    .line 330
    .line 331
    iget-object v4, v0, LQ3/l;->j:LR3/c;

    .line 332
    .line 333
    iget-boolean v4, v4, LR3/c;->d:Z

    .line 334
    .line 335
    if-nez v4, :cond_10

    .line 336
    .line 337
    move-wide/from16 v10, v16

    .line 338
    .line 339
    const-wide/16 v6, 0x0

    .line 340
    .line 341
    goto :goto_b

    .line 342
    :cond_10
    aget-object v4, v10, v27

    .line 343
    .line 344
    invoke-virtual {v4, v14, v15}, LQ3/j;->b(J)J

    .line 345
    .line 346
    .line 347
    move-result-wide v5

    .line 348
    aget-object v4, v10, v27

    .line 349
    .line 350
    invoke-virtual {v4, v5, v6}, LQ3/j;->c(J)J

    .line 351
    .line 352
    .line 353
    move-result-wide v4

    .line 354
    iget-object v6, v0, LQ3/l;->j:LR3/c;

    .line 355
    .line 356
    iget-wide v10, v6, LR3/c;->a:J

    .line 357
    .line 358
    cmp-long v7, v10, v16

    .line 359
    .line 360
    if-nez v7, :cond_11

    .line 361
    .line 362
    move-wide/from16 v6, v16

    .line 363
    .line 364
    goto :goto_a

    .line 365
    :cond_11
    iget v7, v0, LQ3/l;->k:I

    .line 366
    .line 367
    invoke-virtual {v6, v7}, LR3/c;->b(I)LR3/h;

    .line 368
    .line 369
    .line 370
    move-result-object v6

    .line 371
    iget-wide v6, v6, LR3/h;->b:J

    .line 372
    .line 373
    add-long/2addr v10, v6

    .line 374
    invoke-static {v10, v11}, Ll4/y;->H(J)J

    .line 375
    .line 376
    .line 377
    move-result-wide v6

    .line 378
    sub-long v6, v14, v6

    .line 379
    .line 380
    :goto_a
    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 381
    .line 382
    .line 383
    move-result-wide v4

    .line 384
    sub-long v4, v4, p1

    .line 385
    .line 386
    const-wide/16 v6, 0x0

    .line 387
    .line 388
    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 389
    .line 390
    .line 391
    move-result-wide v4

    .line 392
    move-wide v10, v4

    .line 393
    :goto_b
    iget-object v5, v0, LQ3/l;->i:Li4/q;

    .line 394
    .line 395
    move-wide/from16 v24, v6

    .line 396
    .line 397
    const/4 v4, 0x1

    .line 398
    move-wide/from16 v6, p1

    .line 399
    .line 400
    invoke-interface/range {v5 .. v13}, Li4/q;->a(JJJLjava/util/List;[LP3/l;)V

    .line 401
    .line 402
    .line 403
    iget-object v5, v0, LQ3/l;->i:Li4/q;

    .line 404
    .line 405
    invoke-interface {v5}, Li4/q;->p()I

    .line 406
    .line 407
    .line 408
    move-result v5

    .line 409
    invoke-virtual {v0, v5}, LQ3/l;->j(I)LQ3/j;

    .line 410
    .line 411
    .line 412
    move-result-object v5

    .line 413
    iget-object v6, v5, LQ3/j;->g:Ljava/lang/Object;

    .line 414
    .line 415
    check-cast v6, LQ3/i;

    .line 416
    .line 417
    iget-object v7, v5, LQ3/j;->f:Ljava/lang/Object;

    .line 418
    .line 419
    check-cast v7, LR3/b;

    .line 420
    .line 421
    iget-object v8, v5, LQ3/j;->d:Ljava/lang/Object;

    .line 422
    .line 423
    check-cast v8, LP3/d;

    .line 424
    .line 425
    iget-object v9, v5, LQ3/j;->e:Ljava/lang/Object;

    .line 426
    .line 427
    check-cast v9, LR3/m;

    .line 428
    .line 429
    if-eqz v8, :cond_14

    .line 430
    .line 431
    iget-object v10, v8, LP3/d;->i:[Lj3/M;

    .line 432
    .line 433
    if-nez v10, :cond_12

    .line 434
    .line 435
    iget-object v10, v9, LR3/m;->e:LR3/j;

    .line 436
    .line 437
    goto :goto_c

    .line 438
    :cond_12
    move-object/from16 v10, v20

    .line 439
    .line 440
    :goto_c
    if-nez v6, :cond_13

    .line 441
    .line 442
    invoke-virtual {v9}, LR3/m;->e()LR3/j;

    .line 443
    .line 444
    .line 445
    move-result-object v20

    .line 446
    :cond_13
    move-object/from16 v11, v20

    .line 447
    .line 448
    if-nez v10, :cond_15

    .line 449
    .line 450
    if-eqz v11, :cond_14

    .line 451
    .line 452
    goto :goto_d

    .line 453
    :cond_14
    move/from16 v11, v27

    .line 454
    .line 455
    goto :goto_f

    .line 456
    :cond_15
    :goto_d
    iget-object v1, v0, LQ3/l;->i:Li4/q;

    .line 457
    .line 458
    invoke-interface {v1}, Li4/q;->m()Lj3/M;

    .line 459
    .line 460
    .line 461
    move-result-object v15

    .line 462
    iget-object v1, v0, LQ3/l;->i:Li4/q;

    .line 463
    .line 464
    invoke-interface {v1}, Li4/q;->o()I

    .line 465
    .line 466
    .line 467
    move-result v16

    .line 468
    iget-object v1, v0, LQ3/l;->i:Li4/q;

    .line 469
    .line 470
    invoke-interface {v1}, Li4/q;->r()Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v17

    .line 474
    if-eqz v10, :cond_17

    .line 475
    .line 476
    iget-object v1, v7, LR3/b;->a:Ljava/lang/String;

    .line 477
    .line 478
    invoke-virtual {v10, v11, v1}, LR3/j;->a(LR3/j;Ljava/lang/String;)LR3/j;

    .line 479
    .line 480
    .line 481
    move-result-object v1

    .line 482
    if-nez v1, :cond_16

    .line 483
    .line 484
    goto :goto_e

    .line 485
    :cond_16
    move-object v10, v1

    .line 486
    goto :goto_e

    .line 487
    :cond_17
    move-object v10, v11

    .line 488
    :goto_e
    iget-object v1, v7, LR3/b;->a:Ljava/lang/String;

    .line 489
    .line 490
    move/from16 v11, v27

    .line 491
    .line 492
    invoke-static {v9, v1, v10, v11}, La/a;->c(LR3/m;Ljava/lang/String;LR3/j;I)Lk4/p;

    .line 493
    .line 494
    .line 495
    move-result-object v14

    .line 496
    new-instance v12, LP3/j;

    .line 497
    .line 498
    iget-object v1, v5, LQ3/j;->d:Ljava/lang/Object;

    .line 499
    .line 500
    move-object/from16 v18, v1

    .line 501
    .line 502
    check-cast v18, LP3/d;

    .line 503
    .line 504
    iget-object v13, v0, LQ3/l;->e:Lk4/m;

    .line 505
    .line 506
    invoke-direct/range {v12 .. v18}, LP3/j;-><init>(Lk4/m;Lk4/p;Lj3/M;ILjava/lang/Object;LP3/d;)V

    .line 507
    .line 508
    .line 509
    iput-object v12, v3, LA6/i;->b:Ljava/lang/Object;

    .line 510
    .line 511
    return-void

    .line 512
    :goto_f
    iget-wide v12, v5, LQ3/j;->b:J

    .line 513
    .line 514
    cmp-long v10, v12, v16

    .line 515
    .line 516
    if-eqz v10, :cond_18

    .line 517
    .line 518
    move v11, v4

    .line 519
    :cond_18
    invoke-interface {v6, v12, v13}, LQ3/i;->z(J)J

    .line 520
    .line 521
    .line 522
    move-result-wide v22

    .line 523
    cmp-long v20, v22, v24

    .line 524
    .line 525
    if-nez v20, :cond_19

    .line 526
    .line 527
    iput-boolean v11, v3, LA6/i;->a:Z

    .line 528
    .line 529
    return-void

    .line 530
    :cond_19
    invoke-interface {v6, v12, v13, v14, v15}, LQ3/i;->k(JJ)J

    .line 531
    .line 532
    .line 533
    move-result-wide v22

    .line 534
    move/from16 p1, v10

    .line 535
    .line 536
    move/from16 v20, v11

    .line 537
    .line 538
    iget-wide v10, v5, LQ3/j;->c:J

    .line 539
    .line 540
    add-long v30, v22, v10

    .line 541
    .line 542
    invoke-virtual {v5, v14, v15}, LQ3/j;->b(J)J

    .line 543
    .line 544
    .line 545
    move-result-wide v32

    .line 546
    if-eqz v21, :cond_1a

    .line 547
    .line 548
    invoke-virtual/range {v21 .. v21}, LP3/k;->b()J

    .line 549
    .line 550
    .line 551
    move-result-wide v14

    .line 552
    goto :goto_10

    .line 553
    :cond_1a
    invoke-interface {v6, v1, v2, v12, v13}, LQ3/i;->d(JJ)J

    .line 554
    .line 555
    .line 556
    move-result-wide v14

    .line 557
    add-long v28, v14, v10

    .line 558
    .line 559
    invoke-static/range {v28 .. v33}, Ll4/y;->j(JJJ)J

    .line 560
    .line 561
    .line 562
    move-result-wide v14

    .line 563
    :goto_10
    cmp-long v21, v14, v30

    .line 564
    .line 565
    if-gez v21, :cond_1b

    .line 566
    .line 567
    new-instance v1, LN3/b;

    .line 568
    .line 569
    invoke-direct {v1}, Ljava/io/IOException;-><init>()V

    .line 570
    .line 571
    .line 572
    iput-object v1, v0, LQ3/l;->l:LN3/b;

    .line 573
    .line 574
    return-void

    .line 575
    :cond_1b
    cmp-long v21, v14, v32

    .line 576
    .line 577
    if-gtz v21, :cond_1c

    .line 578
    .line 579
    iget-boolean v4, v0, LQ3/l;->m:Z

    .line 580
    .line 581
    if-eqz v4, :cond_1d

    .line 582
    .line 583
    if-ltz v21, :cond_1d

    .line 584
    .line 585
    :cond_1c
    move/from16 v11, v20

    .line 586
    .line 587
    goto/16 :goto_1e

    .line 588
    .line 589
    :cond_1d
    if-eqz v20, :cond_1e

    .line 590
    .line 591
    invoke-virtual {v5, v14, v15}, LQ3/j;->d(J)J

    .line 592
    .line 593
    .line 594
    move-result-wide v20

    .line 595
    cmp-long v4, v20, v12

    .line 596
    .line 597
    if-ltz v4, :cond_1e

    .line 598
    .line 599
    const/4 v4, 0x1

    .line 600
    iput-boolean v4, v3, LA6/i;->a:Z

    .line 601
    .line 602
    return-void

    .line 603
    :cond_1e
    const/4 v4, 0x1

    .line 604
    int-to-long v1, v4

    .line 605
    sub-long v32, v32, v14

    .line 606
    .line 607
    const-wide/16 v20, 0x1

    .line 608
    .line 609
    move-object/from16 p2, v5

    .line 610
    .line 611
    add-long v4, v32, v20

    .line 612
    .line 613
    invoke-static {v1, v2, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 614
    .line 615
    .line 616
    move-result-wide v1

    .line 617
    long-to-int v1, v1

    .line 618
    if-eqz p1, :cond_1f

    .line 619
    .line 620
    :goto_11
    const/4 v4, 0x1

    .line 621
    if-le v1, v4, :cond_1f

    .line 622
    .line 623
    int-to-long v4, v1

    .line 624
    add-long/2addr v4, v14

    .line 625
    sub-long v4, v4, v20

    .line 626
    .line 627
    move-object/from16 v2, p2

    .line 628
    .line 629
    invoke-virtual {v2, v4, v5}, LQ3/j;->d(J)J

    .line 630
    .line 631
    .line 632
    move-result-wide v4

    .line 633
    cmp-long v4, v4, v12

    .line 634
    .line 635
    if-ltz v4, :cond_20

    .line 636
    .line 637
    add-int/lit8 v1, v1, -0x1

    .line 638
    .line 639
    move-object/from16 p2, v2

    .line 640
    .line 641
    goto :goto_11

    .line 642
    :cond_1f
    move-object/from16 v2, p2

    .line 643
    .line 644
    :cond_20
    invoke-interface/range {p5 .. p5}, Ljava/util/List;->isEmpty()Z

    .line 645
    .line 646
    .line 647
    move-result v4

    .line 648
    if-eqz v4, :cond_21

    .line 649
    .line 650
    move-wide/from16 v44, p3

    .line 651
    .line 652
    goto :goto_12

    .line 653
    :cond_21
    move-wide/from16 v44, v16

    .line 654
    .line 655
    :goto_12
    iget-object v4, v0, LQ3/l;->i:Li4/q;

    .line 656
    .line 657
    invoke-interface {v4}, Li4/q;->m()Lj3/M;

    .line 658
    .line 659
    .line 660
    move-result-object v37

    .line 661
    iget-object v4, v0, LQ3/l;->i:Li4/q;

    .line 662
    .line 663
    invoke-interface {v4}, Li4/q;->o()I

    .line 664
    .line 665
    .line 666
    move-result v38

    .line 667
    iget-object v4, v0, LQ3/l;->i:Li4/q;

    .line 668
    .line 669
    invoke-interface {v4}, Li4/q;->r()Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    move-result-object v39

    .line 673
    invoke-virtual {v2, v14, v15}, LQ3/j;->d(J)J

    .line 674
    .line 675
    .line 676
    move-result-wide v40

    .line 677
    sub-long v4, v14, v10

    .line 678
    .line 679
    invoke-interface {v6, v4, v5}, LQ3/i;->p(J)LR3/j;

    .line 680
    .line 681
    .line 682
    move-result-object v4

    .line 683
    iget-object v5, v0, LQ3/l;->e:Lk4/m;

    .line 684
    .line 685
    const/16 v22, 0x8

    .line 686
    .line 687
    if-nez v8, :cond_26

    .line 688
    .line 689
    invoke-virtual {v2, v14, v15}, LQ3/j;->c(J)J

    .line 690
    .line 691
    .line 692
    move-result-wide v42

    .line 693
    invoke-interface {v6}, LQ3/i;->q()Z

    .line 694
    .line 695
    .line 696
    move-result v1

    .line 697
    if-eqz v1, :cond_22

    .line 698
    .line 699
    goto :goto_13

    .line 700
    :cond_22
    cmp-long v1, v18, v16

    .line 701
    .line 702
    if-eqz v1, :cond_24

    .line 703
    .line 704
    invoke-virtual {v2, v14, v15}, LQ3/j;->c(J)J

    .line 705
    .line 706
    .line 707
    move-result-wide v1

    .line 708
    cmp-long v1, v1, v18

    .line 709
    .line 710
    if-gtz v1, :cond_23

    .line 711
    .line 712
    goto :goto_13

    .line 713
    :cond_23
    const/16 v23, 0x0

    .line 714
    .line 715
    goto :goto_14

    .line 716
    :cond_24
    :goto_13
    const/16 v23, 0x1

    .line 717
    .line 718
    :goto_14
    if-eqz v23, :cond_25

    .line 719
    .line 720
    const/4 v1, 0x0

    .line 721
    goto :goto_15

    .line 722
    :cond_25
    move/from16 v1, v22

    .line 723
    .line 724
    :goto_15
    iget-object v2, v7, LR3/b;->a:Ljava/lang/String;

    .line 725
    .line 726
    invoke-static {v9, v2, v4, v1}, La/a;->c(LR3/m;Ljava/lang/String;LR3/j;I)Lk4/p;

    .line 727
    .line 728
    .line 729
    move-result-object v36

    .line 730
    new-instance v34, LP3/m;

    .line 731
    .line 732
    iget v1, v0, LQ3/l;->d:I

    .line 733
    .line 734
    move-object/from16 v47, v37

    .line 735
    .line 736
    move/from16 v46, v1

    .line 737
    .line 738
    move-object/from16 v35, v5

    .line 739
    .line 740
    move-wide/from16 v44, v14

    .line 741
    .line 742
    invoke-direct/range {v34 .. v47}, LP3/m;-><init>(Lk4/m;Lk4/p;Lj3/M;ILjava/lang/Object;JJJILj3/M;)V

    .line 743
    .line 744
    .line 745
    :goto_16
    move-object/from16 v1, v34

    .line 746
    .line 747
    goto/16 :goto_1d

    .line 748
    .line 749
    :cond_26
    move-object/from16 v35, v5

    .line 750
    .line 751
    move-wide/from16 v48, v14

    .line 752
    .line 753
    const/4 v5, 0x1

    .line 754
    const/4 v8, 0x1

    .line 755
    :goto_17
    if-ge v5, v1, :cond_28

    .line 756
    .line 757
    int-to-long v14, v5

    .line 758
    add-long v14, v48, v14

    .line 759
    .line 760
    sub-long/2addr v14, v10

    .line 761
    invoke-interface {v6, v14, v15}, LQ3/i;->p(J)LR3/j;

    .line 762
    .line 763
    .line 764
    move-result-object v14

    .line 765
    iget-object v15, v7, LR3/b;->a:Ljava/lang/String;

    .line 766
    .line 767
    invoke-virtual {v4, v14, v15}, LR3/j;->a(LR3/j;Ljava/lang/String;)LR3/j;

    .line 768
    .line 769
    .line 770
    move-result-object v14

    .line 771
    if-nez v14, :cond_27

    .line 772
    .line 773
    goto :goto_18

    .line 774
    :cond_27
    add-int/lit8 v8, v8, 0x1

    .line 775
    .line 776
    add-int/lit8 v5, v5, 0x1

    .line 777
    .line 778
    move-object v4, v14

    .line 779
    goto :goto_17

    .line 780
    :cond_28
    :goto_18
    int-to-long v10, v8

    .line 781
    add-long v14, v48, v10

    .line 782
    .line 783
    sub-long v14, v14, v20

    .line 784
    .line 785
    invoke-virtual {v2, v14, v15}, LQ3/j;->c(J)J

    .line 786
    .line 787
    .line 788
    move-result-wide v42

    .line 789
    if-eqz p1, :cond_29

    .line 790
    .line 791
    cmp-long v1, v12, v42

    .line 792
    .line 793
    if-gtz v1, :cond_29

    .line 794
    .line 795
    move-wide/from16 v46, v12

    .line 796
    .line 797
    goto :goto_19

    .line 798
    :cond_29
    move-wide/from16 v46, v16

    .line 799
    .line 800
    :goto_19
    invoke-interface {v6}, LQ3/i;->q()Z

    .line 801
    .line 802
    .line 803
    move-result v1

    .line 804
    if-eqz v1, :cond_2a

    .line 805
    .line 806
    goto :goto_1a

    .line 807
    :cond_2a
    cmp-long v1, v18, v16

    .line 808
    .line 809
    if-eqz v1, :cond_2c

    .line 810
    .line 811
    invoke-virtual {v2, v14, v15}, LQ3/j;->c(J)J

    .line 812
    .line 813
    .line 814
    move-result-wide v5

    .line 815
    cmp-long v1, v5, v18

    .line 816
    .line 817
    if-gtz v1, :cond_2b

    .line 818
    .line 819
    goto :goto_1a

    .line 820
    :cond_2b
    const/4 v5, 0x0

    .line 821
    goto :goto_1b

    .line 822
    :cond_2c
    :goto_1a
    const/4 v5, 0x1

    .line 823
    :goto_1b
    if-eqz v5, :cond_2d

    .line 824
    .line 825
    const/4 v1, 0x0

    .line 826
    goto :goto_1c

    .line 827
    :cond_2d
    move/from16 v1, v22

    .line 828
    .line 829
    :goto_1c
    iget-object v5, v7, LR3/b;->a:Ljava/lang/String;

    .line 830
    .line 831
    invoke-static {v9, v5, v4, v1}, La/a;->c(LR3/m;Ljava/lang/String;LR3/j;I)Lk4/p;

    .line 832
    .line 833
    .line 834
    move-result-object v36

    .line 835
    iget-wide v4, v9, LR3/m;->c:J

    .line 836
    .line 837
    neg-long v4, v4

    .line 838
    new-instance v34, LP3/i;

    .line 839
    .line 840
    iget-object v1, v2, LQ3/j;->d:Ljava/lang/Object;

    .line 841
    .line 842
    move-object/from16 v53, v1

    .line 843
    .line 844
    check-cast v53, LP3/d;

    .line 845
    .line 846
    move-wide/from16 v51, v4

    .line 847
    .line 848
    move/from16 v50, v8

    .line 849
    .line 850
    invoke-direct/range {v34 .. v53}, LP3/i;-><init>(Lk4/m;Lk4/p;Lj3/M;ILjava/lang/Object;JJJJJIJLP3/d;)V

    .line 851
    .line 852
    .line 853
    goto :goto_16

    .line 854
    :goto_1d
    iput-object v1, v3, LA6/i;->b:Ljava/lang/Object;

    .line 855
    .line 856
    return-void

    .line 857
    :goto_1e
    iput-boolean v11, v3, LA6/i;->a:Z

    .line 858
    .line 859
    return-void
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
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
.end method

.method public final h(LP3/e;ZLA1/i;Le1/q;)Z
    .locals 11

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    goto/16 :goto_7

    .line 6
    .line 7
    :cond_0
    iget-object p2, p0, LQ3/l;->g:LQ3/o;

    .line 8
    .line 9
    if-eqz p2, :cond_5

    .line 10
    .line 11
    iget-wide v2, p2, LQ3/o;->d:J

    .line 12
    .line 13
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    cmp-long v4, v2, v4

    .line 19
    .line 20
    if-eqz v4, :cond_1

    .line 21
    .line 22
    iget-wide v4, p1, LP3/e;->g:J

    .line 23
    .line 24
    cmp-long v2, v2, v4

    .line 25
    .line 26
    if-gez v2, :cond_1

    .line 27
    .line 28
    move v2, v0

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move v2, v1

    .line 31
    :goto_0
    iget-object p2, p2, LQ3/o;->e:LQ3/p;

    .line 32
    .line 33
    iget-object v3, p2, LQ3/p;->f:LR3/c;

    .line 34
    .line 35
    iget-boolean v3, v3, LR3/c;->d:Z

    .line 36
    .line 37
    if-nez v3, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    iget-boolean v3, p2, LQ3/p;->h:Z

    .line 41
    .line 42
    if-eqz v3, :cond_3

    .line 43
    .line 44
    goto/16 :goto_6

    .line 45
    .line 46
    :cond_3
    if-eqz v2, :cond_5

    .line 47
    .line 48
    iget-boolean p1, p2, LQ3/p;->g:Z

    .line 49
    .line 50
    if-nez p1, :cond_4

    .line 51
    .line 52
    goto/16 :goto_6

    .line 53
    .line 54
    :cond_4
    iput-boolean v0, p2, LQ3/p;->h:Z

    .line 55
    .line 56
    iput-boolean v1, p2, LQ3/p;->g:Z

    .line 57
    .line 58
    iget-object p1, p2, LQ3/p;->b:LQ3/f;

    .line 59
    .line 60
    iget-object p1, p1, LQ3/f;->a:LQ3/h;

    .line 61
    .line 62
    iget-object p2, p1, LQ3/h;->D:Landroid/os/Handler;

    .line 63
    .line 64
    iget-object p3, p1, LQ3/h;->w:LQ3/c;

    .line 65
    .line 66
    invoke-virtual {p2, p3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, LQ3/h;->y()V

    .line 70
    .line 71
    .line 72
    return v0

    .line 73
    :cond_5
    :goto_1
    iget-object p2, p0, LQ3/l;->j:LR3/c;

    .line 74
    .line 75
    iget-boolean p2, p2, LR3/c;->d:Z

    .line 76
    .line 77
    iget-object v2, p0, LQ3/l;->h:[LQ3/j;

    .line 78
    .line 79
    if-nez p2, :cond_6

    .line 80
    .line 81
    instance-of p2, p1, LP3/k;

    .line 82
    .line 83
    if-eqz p2, :cond_6

    .line 84
    .line 85
    iget-object p2, p3, LA1/i;->b:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p2, Ljava/io/IOException;

    .line 88
    .line 89
    instance-of v3, p2, Lk4/D;

    .line 90
    .line 91
    if-eqz v3, :cond_6

    .line 92
    .line 93
    check-cast p2, Lk4/D;

    .line 94
    .line 95
    iget p2, p2, Lk4/D;->d:I

    .line 96
    .line 97
    const/16 v3, 0x194

    .line 98
    .line 99
    if-ne p2, v3, :cond_6

    .line 100
    .line 101
    iget-object p2, p0, LQ3/l;->i:Li4/q;

    .line 102
    .line 103
    iget-object v3, p1, LP3/e;->d:Lj3/M;

    .line 104
    .line 105
    invoke-interface {p2, v3}, Li4/q;->k(Lj3/M;)I

    .line 106
    .line 107
    .line 108
    move-result p2

    .line 109
    aget-object p2, v2, p2

    .line 110
    .line 111
    iget-object v3, p2, LQ3/j;->g:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v3, LQ3/i;

    .line 114
    .line 115
    iget-wide v4, p2, LQ3/j;->b:J

    .line 116
    .line 117
    invoke-interface {v3, v4, v5}, LQ3/i;->z(J)J

    .line 118
    .line 119
    .line 120
    move-result-wide v3

    .line 121
    const-wide/16 v5, -0x1

    .line 122
    .line 123
    cmp-long v5, v3, v5

    .line 124
    .line 125
    if-eqz v5, :cond_6

    .line 126
    .line 127
    const-wide/16 v5, 0x0

    .line 128
    .line 129
    cmp-long v5, v3, v5

    .line 130
    .line 131
    if-eqz v5, :cond_6

    .line 132
    .line 133
    iget-object v5, p2, LQ3/j;->g:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v5, LQ3/i;

    .line 136
    .line 137
    invoke-interface {v5}, LQ3/i;->v()J

    .line 138
    .line 139
    .line 140
    move-result-wide v5

    .line 141
    iget-wide v7, p2, LQ3/j;->c:J

    .line 142
    .line 143
    add-long/2addr v5, v7

    .line 144
    add-long/2addr v5, v3

    .line 145
    const-wide/16 v3, 0x1

    .line 146
    .line 147
    sub-long/2addr v5, v3

    .line 148
    move-object p2, p1

    .line 149
    check-cast p2, LP3/k;

    .line 150
    .line 151
    invoke-virtual {p2}, LP3/k;->b()J

    .line 152
    .line 153
    .line 154
    move-result-wide v3

    .line 155
    cmp-long p2, v3, v5

    .line 156
    .line 157
    if-lez p2, :cond_6

    .line 158
    .line 159
    iput-boolean v0, p0, LQ3/l;->m:Z

    .line 160
    .line 161
    return v0

    .line 162
    :cond_6
    iget-object p2, p0, LQ3/l;->i:Li4/q;

    .line 163
    .line 164
    iget-object v3, p1, LP3/e;->d:Lj3/M;

    .line 165
    .line 166
    invoke-interface {p2, v3}, Li4/q;->k(Lj3/M;)I

    .line 167
    .line 168
    .line 169
    move-result p2

    .line 170
    aget-object p2, v2, p2

    .line 171
    .line 172
    iget-object v2, p2, LQ3/j;->e:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v2, LR3/m;

    .line 175
    .line 176
    iget-object v2, v2, LR3/m;->b:LP5/F;

    .line 177
    .line 178
    iget-object v3, p0, LQ3/l;->b:Lcom/google/firebase/messaging/s;

    .line 179
    .line 180
    invoke-virtual {v3, v2}, Lcom/google/firebase/messaging/s;->t(Ljava/util/List;)LR3/b;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    iget-object v4, p2, LQ3/j;->f:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v4, LR3/b;

    .line 187
    .line 188
    if-eqz v2, :cond_7

    .line 189
    .line 190
    invoke-virtual {v4, v2}, LR3/b;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    if-nez v2, :cond_7

    .line 195
    .line 196
    goto/16 :goto_6

    .line 197
    .line 198
    :cond_7
    iget-object v2, p0, LQ3/l;->i:Li4/q;

    .line 199
    .line 200
    iget-object p2, p2, LQ3/j;->e:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast p2, LR3/m;

    .line 203
    .line 204
    iget-object p2, p2, LR3/m;->b:LP5/F;

    .line 205
    .line 206
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 207
    .line 208
    .line 209
    move-result-wide v5

    .line 210
    invoke-interface {v2}, Li4/q;->length()I

    .line 211
    .line 212
    .line 213
    move-result v7

    .line 214
    move v8, v1

    .line 215
    move v9, v8

    .line 216
    :goto_2
    if-ge v8, v7, :cond_9

    .line 217
    .line 218
    invoke-interface {v2, v5, v6, v8}, Li4/q;->h(JI)Z

    .line 219
    .line 220
    .line 221
    move-result v10

    .line 222
    if-eqz v10, :cond_8

    .line 223
    .line 224
    add-int/2addr v9, v0

    .line 225
    :cond_8
    add-int/2addr v8, v0

    .line 226
    goto :goto_2

    .line 227
    :cond_9
    new-instance v2, Ljava/util/HashSet;

    .line 228
    .line 229
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 230
    .line 231
    .line 232
    move v5, v1

    .line 233
    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 234
    .line 235
    .line 236
    move-result v6

    .line 237
    if-ge v5, v6, :cond_a

    .line 238
    .line 239
    invoke-interface {p2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v6

    .line 243
    check-cast v6, LR3/b;

    .line 244
    .line 245
    iget v6, v6, LR3/b;->c:I

    .line 246
    .line 247
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 248
    .line 249
    .line 250
    move-result-object v6

    .line 251
    invoke-virtual {v2, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    add-int/2addr v5, v0

    .line 255
    goto :goto_3

    .line 256
    :cond_a
    invoke-virtual {v2}, Ljava/util/HashSet;->size()I

    .line 257
    .line 258
    .line 259
    move-result v2

    .line 260
    new-instance v5, Lk4/G;

    .line 261
    .line 262
    new-instance v6, Ljava/util/HashSet;

    .line 263
    .line 264
    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v3, p2}, Lcom/google/firebase/messaging/s;->b(Ljava/util/List;)Ljava/util/ArrayList;

    .line 268
    .line 269
    .line 270
    move-result-object p2

    .line 271
    move v8, v1

    .line 272
    :goto_4
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 273
    .line 274
    .line 275
    move-result v10

    .line 276
    if-ge v8, v10, :cond_b

    .line 277
    .line 278
    invoke-virtual {p2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v10

    .line 282
    check-cast v10, LR3/b;

    .line 283
    .line 284
    iget v10, v10, LR3/b;->c:I

    .line 285
    .line 286
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 287
    .line 288
    .line 289
    move-result-object v10

    .line 290
    invoke-virtual {v6, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    add-int/2addr v8, v0

    .line 294
    goto :goto_4

    .line 295
    :cond_b
    invoke-virtual {v6}, Ljava/util/HashSet;->size()I

    .line 296
    .line 297
    .line 298
    move-result p2

    .line 299
    sub-int p2, v2, p2

    .line 300
    .line 301
    invoke-direct {v5, v2, p2, v7, v9}, Lk4/G;-><init>(IIII)V

    .line 302
    .line 303
    .line 304
    const/4 p2, 0x2

    .line 305
    invoke-virtual {v5, p2}, Lk4/G;->a(I)Z

    .line 306
    .line 307
    .line 308
    move-result v2

    .line 309
    if-nez v2, :cond_c

    .line 310
    .line 311
    invoke-virtual {v5, v0}, Lk4/G;->a(I)Z

    .line 312
    .line 313
    .line 314
    move-result v2

    .line 315
    if-nez v2, :cond_c

    .line 316
    .line 317
    goto/16 :goto_7

    .line 318
    .line 319
    :cond_c
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    invoke-static {v5, p3}, Le1/q;->e(Lk4/G;LA1/i;)LB3/f;

    .line 323
    .line 324
    .line 325
    move-result-object p3

    .line 326
    if-eqz p3, :cond_12

    .line 327
    .line 328
    iget p4, p3, LB3/f;->a:I

    .line 329
    .line 330
    invoke-virtual {v5, p4}, Lk4/G;->a(I)Z

    .line 331
    .line 332
    .line 333
    move-result v2

    .line 334
    if-nez v2, :cond_d

    .line 335
    .line 336
    goto :goto_7

    .line 337
    :cond_d
    iget-wide v5, p3, LB3/f;->b:J

    .line 338
    .line 339
    if-ne p4, p2, :cond_e

    .line 340
    .line 341
    iget-object p2, p0, LQ3/l;->i:Li4/q;

    .line 342
    .line 343
    iget-object p1, p1, LP3/e;->d:Lj3/M;

    .line 344
    .line 345
    invoke-interface {p2, p1}, Li4/q;->k(Lj3/M;)I

    .line 346
    .line 347
    .line 348
    move-result p1

    .line 349
    invoke-interface {p2, v5, v6, p1}, Li4/q;->g(JI)Z

    .line 350
    .line 351
    .line 352
    move-result p1

    .line 353
    return p1

    .line 354
    :cond_e
    if-ne p4, v0, :cond_12

    .line 355
    .line 356
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 357
    .line 358
    .line 359
    move-result-wide p1

    .line 360
    add-long/2addr p1, v5

    .line 361
    iget-object p3, v4, LR3/b;->b:Ljava/lang/String;

    .line 362
    .line 363
    iget-object p4, v3, Lcom/google/firebase/messaging/s;->b:Ljava/lang/Object;

    .line 364
    .line 365
    check-cast p4, Ljava/util/HashMap;

    .line 366
    .line 367
    invoke-virtual {p4, p3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v1

    .line 371
    if-eqz v1, :cond_f

    .line 372
    .line 373
    invoke-virtual {p4, p3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v1

    .line 377
    check-cast v1, Ljava/lang/Long;

    .line 378
    .line 379
    sget v2, Ll4/y;->a:I

    .line 380
    .line 381
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 382
    .line 383
    .line 384
    move-result-wide v1

    .line 385
    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 386
    .line 387
    .line 388
    move-result-wide v1

    .line 389
    goto :goto_5

    .line 390
    :cond_f
    move-wide v1, p1

    .line 391
    :goto_5
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    invoke-virtual {p4, p3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    const/high16 p3, -0x80000000

    .line 399
    .line 400
    iget p4, v4, LR3/b;->c:I

    .line 401
    .line 402
    if-eq p4, p3, :cond_11

    .line 403
    .line 404
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 405
    .line 406
    .line 407
    move-result-object p3

    .line 408
    iget-object p4, v3, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 409
    .line 410
    check-cast p4, Ljava/util/HashMap;

    .line 411
    .line 412
    invoke-virtual {p4, p3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 413
    .line 414
    .line 415
    move-result v1

    .line 416
    if-eqz v1, :cond_10

    .line 417
    .line 418
    invoke-virtual {p4, p3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v1

    .line 422
    check-cast v1, Ljava/lang/Long;

    .line 423
    .line 424
    sget v2, Ll4/y;->a:I

    .line 425
    .line 426
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 427
    .line 428
    .line 429
    move-result-wide v1

    .line 430
    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 431
    .line 432
    .line 433
    move-result-wide p1

    .line 434
    :cond_10
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 435
    .line 436
    .line 437
    move-result-object p1

    .line 438
    invoke-virtual {p4, p3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    :cond_11
    :goto_6
    return v0

    .line 442
    :cond_12
    :goto_7
    return v1
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
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
.end method

.method public final i()Ljava/util/ArrayList;
    .locals 6

    .line 1
    iget-object v0, p0, LQ3/l;->j:LR3/c;

    .line 2
    .line 3
    iget v1, p0, LQ3/l;->k:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, LR3/c;->b(I)LR3/h;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v0, v0, LR3/h;->c:Ljava/util/List;

    .line 10
    .line 11
    new-instance v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, LQ3/l;->c:[I

    .line 17
    .line 18
    array-length v3, v2

    .line 19
    const/4 v4, 0x0

    .line 20
    :goto_0
    if-ge v4, v3, :cond_0

    .line 21
    .line 22
    aget v5, v2, v4

    .line 23
    .line 24
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    check-cast v5, LR3/a;

    .line 29
    .line 30
    iget-object v5, v5, LR3/a;->c:Ljava/util/List;

    .line 31
    .line 32
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 33
    .line 34
    .line 35
    add-int/lit8 v4, v4, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-object v1
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

.method public final j(I)LQ3/j;
    .locals 13

    .line 1
    iget-object v0, p0, LQ3/l;->h:[LQ3/j;

    .line 2
    .line 3
    aget-object v1, v0, p1

    .line 4
    .line 5
    iget-object v2, v1, LQ3/j;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, LR3/m;

    .line 8
    .line 9
    iget-object v2, v2, LR3/m;->b:LP5/F;

    .line 10
    .line 11
    iget-object v3, p0, LQ3/l;->b:Lcom/google/firebase/messaging/s;

    .line 12
    .line 13
    invoke-virtual {v3, v2}, Lcom/google/firebase/messaging/s;->t(Ljava/util/List;)LR3/b;

    .line 14
    .line 15
    .line 16
    move-result-object v8

    .line 17
    if-eqz v8, :cond_0

    .line 18
    .line 19
    iget-object v2, v1, LQ3/j;->f:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, LR3/b;

    .line 22
    .line 23
    invoke-virtual {v8, v2}, LR3/b;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    new-instance v4, LQ3/j;

    .line 30
    .line 31
    iget-wide v10, v1, LQ3/j;->c:J

    .line 32
    .line 33
    iget-object v2, v1, LQ3/j;->g:Ljava/lang/Object;

    .line 34
    .line 35
    move-object v12, v2

    .line 36
    check-cast v12, LQ3/i;

    .line 37
    .line 38
    iget-wide v5, v1, LQ3/j;->b:J

    .line 39
    .line 40
    iget-object v2, v1, LQ3/j;->e:Ljava/lang/Object;

    .line 41
    .line 42
    move-object v7, v2

    .line 43
    check-cast v7, LR3/m;

    .line 44
    .line 45
    iget-object v1, v1, LQ3/j;->d:Ljava/lang/Object;

    .line 46
    .line 47
    move-object v9, v1

    .line 48
    check-cast v9, LP3/d;

    .line 49
    .line 50
    invoke-direct/range {v4 .. v12}, LQ3/j;-><init>(JLR3/m;LR3/b;LP3/d;JLQ3/i;)V

    .line 51
    .line 52
    .line 53
    aput-object v4, v0, p1

    .line 54
    .line 55
    return-object v4

    .line 56
    :cond_0
    return-object v1
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
.end method
