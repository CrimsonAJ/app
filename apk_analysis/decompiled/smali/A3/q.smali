.class public final LA3/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA3/i;


# instance fields
.field public final a:LA3/D;

.field public final b:Z

.field public final c:Z

.field public final d:LA3/v;

.field public final e:LA3/v;

.field public final f:LA3/v;

.field public g:J

.field public final h:[Z

.field public i:Ljava/lang/String;

.field public j:Lq3/u;

.field public k:LA3/p;

.field public l:Z

.field public m:J

.field public n:Z

.field public final o:LA4/r;


# direct methods
.method public constructor <init>(LA3/D;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LA3/q;->a:LA3/D;

    .line 5
    .line 6
    iput-boolean p2, p0, LA3/q;->b:Z

    .line 7
    .line 8
    iput-boolean p3, p0, LA3/q;->c:Z

    .line 9
    .line 10
    const/4 p1, 0x3

    .line 11
    new-array p1, p1, [Z

    .line 12
    .line 13
    iput-object p1, p0, LA3/q;->h:[Z

    .line 14
    .line 15
    new-instance p1, LA3/v;

    .line 16
    .line 17
    const/4 p2, 0x7

    .line 18
    invoke-direct {p1, p2}, LA3/v;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, LA3/q;->d:LA3/v;

    .line 22
    .line 23
    new-instance p1, LA3/v;

    .line 24
    .line 25
    const/16 p2, 0x8

    .line 26
    .line 27
    invoke-direct {p1, p2}, LA3/v;-><init>(I)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, LA3/q;->e:LA3/v;

    .line 31
    .line 32
    new-instance p1, LA3/v;

    .line 33
    .line 34
    const/4 p2, 0x6

    .line 35
    invoke-direct {p1, p2}, LA3/v;-><init>(I)V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, LA3/q;->f:LA3/v;

    .line 39
    .line 40
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    iput-wide p1, p0, LA3/q;->m:J

    .line 46
    .line 47
    new-instance p1, LA4/r;

    .line 48
    .line 49
    const/4 p2, 0x5

    .line 50
    const/4 p3, 0x0

    .line 51
    invoke-direct {p1, p2, p3}, LA4/r;-><init>(IZ)V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, LA3/q;->o:LA4/r;

    .line 55
    .line 56
    return-void
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


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, LA3/q;->g:J

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, LA3/q;->n:Z

    .line 7
    .line 8
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    iput-wide v1, p0, LA3/q;->m:J

    .line 14
    .line 15
    iget-object v1, p0, LA3/q;->h:[Z

    .line 16
    .line 17
    invoke-static {v1}, Ll4/a;->q([Z)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, LA3/q;->d:LA3/v;

    .line 21
    .line 22
    invoke-virtual {v1}, LA3/v;->f()V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, LA3/q;->e:LA3/v;

    .line 26
    .line 27
    invoke-virtual {v1}, LA3/v;->f()V

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, LA3/q;->f:LA3/v;

    .line 31
    .line 32
    invoke-virtual {v1}, LA3/v;->f()V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, LA3/q;->k:LA3/p;

    .line 36
    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    iput-boolean v0, v1, LA3/p;->k:Z

    .line 40
    .line 41
    iput-boolean v0, v1, LA3/p;->o:Z

    .line 42
    .line 43
    iget-object v1, v1, LA3/p;->n:LA3/o;

    .line 44
    .line 45
    iput-boolean v0, v1, LA3/o;->b:Z

    .line 46
    .line 47
    iput-boolean v0, v1, LA3/o;->a:Z

    .line 48
    .line 49
    :cond_0
    return-void
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

.method public final b([BII)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    iget-boolean v4, v0, LA3/q;->l:Z

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    iget-object v4, v0, LA3/q;->k:LA3/p;

    .line 14
    .line 15
    iget-boolean v4, v4, LA3/p;->c:Z

    .line 16
    .line 17
    if-eqz v4, :cond_1

    .line 18
    .line 19
    :cond_0
    iget-object v4, v0, LA3/q;->d:LA3/v;

    .line 20
    .line 21
    invoke-virtual {v4, v1, v2, v3}, LA3/v;->a([BII)V

    .line 22
    .line 23
    .line 24
    iget-object v4, v0, LA3/q;->e:LA3/v;

    .line 25
    .line 26
    invoke-virtual {v4, v1, v2, v3}, LA3/v;->a([BII)V

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-object v4, v0, LA3/q;->f:LA3/v;

    .line 30
    .line 31
    invoke-virtual {v4, v1, v2, v3}, LA3/v;->a([BII)V

    .line 32
    .line 33
    .line 34
    iget-object v4, v0, LA3/q;->k:LA3/p;

    .line 35
    .line 36
    iget-boolean v5, v4, LA3/p;->k:Z

    .line 37
    .line 38
    if-nez v5, :cond_2

    .line 39
    .line 40
    goto/16 :goto_6

    .line 41
    .line 42
    :cond_2
    sub-int/2addr v3, v2

    .line 43
    iget-object v5, v4, LA3/p;->g:[B

    .line 44
    .line 45
    array-length v6, v5

    .line 46
    iget v7, v4, LA3/p;->h:I

    .line 47
    .line 48
    add-int/2addr v7, v3

    .line 49
    const/4 v8, 0x2

    .line 50
    if-ge v6, v7, :cond_3

    .line 51
    .line 52
    mul-int/2addr v7, v8

    .line 53
    invoke-static {v5, v7}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    iput-object v5, v4, LA3/p;->g:[B

    .line 58
    .line 59
    :cond_3
    iget-object v5, v4, LA3/p;->g:[B

    .line 60
    .line 61
    iget v6, v4, LA3/p;->h:I

    .line 62
    .line 63
    invoke-static {v1, v2, v5, v6, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 64
    .line 65
    .line 66
    iget v1, v4, LA3/p;->h:I

    .line 67
    .line 68
    add-int/2addr v1, v3

    .line 69
    iput v1, v4, LA3/p;->h:I

    .line 70
    .line 71
    iget-object v2, v4, LA3/p;->g:[B

    .line 72
    .line 73
    iget-object v3, v4, LA3/p;->f:LZ3/f;

    .line 74
    .line 75
    iput-object v2, v3, LZ3/f;->b:[B

    .line 76
    .line 77
    const/4 v2, 0x0

    .line 78
    iput v2, v3, LZ3/f;->d:I

    .line 79
    .line 80
    iput v1, v3, LZ3/f;->c:I

    .line 81
    .line 82
    iput v2, v3, LZ3/f;->e:I

    .line 83
    .line 84
    invoke-virtual {v3}, LZ3/f;->a()V

    .line 85
    .line 86
    .line 87
    const/16 v1, 0x8

    .line 88
    .line 89
    invoke-virtual {v3, v1}, LZ3/f;->d(I)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-nez v1, :cond_4

    .line 94
    .line 95
    goto/16 :goto_6

    .line 96
    .line 97
    :cond_4
    invoke-virtual {v3}, LZ3/f;->q()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3, v8}, LZ3/f;->i(I)I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    const/4 v5, 0x5

    .line 105
    invoke-virtual {v3, v5}, LZ3/f;->r(I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3}, LZ3/f;->e()Z

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    if-nez v6, :cond_5

    .line 113
    .line 114
    goto/16 :goto_6

    .line 115
    .line 116
    :cond_5
    invoke-virtual {v3}, LZ3/f;->l()I

    .line 117
    .line 118
    .line 119
    invoke-virtual {v3}, LZ3/f;->e()Z

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    if-nez v6, :cond_6

    .line 124
    .line 125
    goto/16 :goto_6

    .line 126
    .line 127
    :cond_6
    invoke-virtual {v3}, LZ3/f;->l()I

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    iget-boolean v7, v4, LA3/p;->c:Z

    .line 132
    .line 133
    const/4 v9, 0x1

    .line 134
    if-nez v7, :cond_7

    .line 135
    .line 136
    iput-boolean v2, v4, LA3/p;->k:Z

    .line 137
    .line 138
    iget-object v1, v4, LA3/p;->n:LA3/o;

    .line 139
    .line 140
    iput v6, v1, LA3/o;->e:I

    .line 141
    .line 142
    iput-boolean v9, v1, LA3/o;->b:Z

    .line 143
    .line 144
    return-void

    .line 145
    :cond_7
    invoke-virtual {v3}, LZ3/f;->e()Z

    .line 146
    .line 147
    .line 148
    move-result v7

    .line 149
    if-nez v7, :cond_8

    .line 150
    .line 151
    goto/16 :goto_6

    .line 152
    .line 153
    :cond_8
    invoke-virtual {v3}, LZ3/f;->l()I

    .line 154
    .line 155
    .line 156
    move-result v7

    .line 157
    iget-object v10, v4, LA3/p;->e:Landroid/util/SparseArray;

    .line 158
    .line 159
    invoke-virtual {v10, v7}, Landroid/util/SparseArray;->indexOfKey(I)I

    .line 160
    .line 161
    .line 162
    move-result v11

    .line 163
    if-gez v11, :cond_9

    .line 164
    .line 165
    iput-boolean v2, v4, LA3/p;->k:Z

    .line 166
    .line 167
    return-void

    .line 168
    :cond_9
    invoke-virtual {v10, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v10

    .line 172
    check-cast v10, Ll4/p;

    .line 173
    .line 174
    iget-object v11, v4, LA3/p;->d:Landroid/util/SparseArray;

    .line 175
    .line 176
    iget v12, v10, Ll4/p;->a:I

    .line 177
    .line 178
    invoke-virtual {v11, v12}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v11

    .line 182
    check-cast v11, Ll4/q;

    .line 183
    .line 184
    iget-boolean v12, v11, Ll4/q;->h:Z

    .line 185
    .line 186
    if-eqz v12, :cond_b

    .line 187
    .line 188
    invoke-virtual {v3, v8}, LZ3/f;->d(I)Z

    .line 189
    .line 190
    .line 191
    move-result v12

    .line 192
    if-nez v12, :cond_a

    .line 193
    .line 194
    goto/16 :goto_6

    .line 195
    .line 196
    :cond_a
    invoke-virtual {v3, v8}, LZ3/f;->r(I)V

    .line 197
    .line 198
    .line 199
    :cond_b
    iget v8, v11, Ll4/q;->j:I

    .line 200
    .line 201
    invoke-virtual {v3, v8}, LZ3/f;->d(I)Z

    .line 202
    .line 203
    .line 204
    move-result v12

    .line 205
    if-nez v12, :cond_c

    .line 206
    .line 207
    goto/16 :goto_6

    .line 208
    .line 209
    :cond_c
    invoke-virtual {v3, v8}, LZ3/f;->i(I)I

    .line 210
    .line 211
    .line 212
    move-result v8

    .line 213
    iget-boolean v12, v11, Ll4/q;->i:Z

    .line 214
    .line 215
    if-nez v12, :cond_10

    .line 216
    .line 217
    invoke-virtual {v3, v9}, LZ3/f;->d(I)Z

    .line 218
    .line 219
    .line 220
    move-result v12

    .line 221
    if-nez v12, :cond_d

    .line 222
    .line 223
    goto/16 :goto_6

    .line 224
    .line 225
    :cond_d
    invoke-virtual {v3}, LZ3/f;->h()Z

    .line 226
    .line 227
    .line 228
    move-result v12

    .line 229
    if-eqz v12, :cond_f

    .line 230
    .line 231
    invoke-virtual {v3, v9}, LZ3/f;->d(I)Z

    .line 232
    .line 233
    .line 234
    move-result v13

    .line 235
    if-nez v13, :cond_e

    .line 236
    .line 237
    goto/16 :goto_6

    .line 238
    .line 239
    :cond_e
    invoke-virtual {v3}, LZ3/f;->h()Z

    .line 240
    .line 241
    .line 242
    move-result v13

    .line 243
    move v14, v9

    .line 244
    goto :goto_1

    .line 245
    :cond_f
    move v13, v2

    .line 246
    :goto_0
    move v14, v13

    .line 247
    goto :goto_1

    .line 248
    :cond_10
    move v12, v2

    .line 249
    move v13, v12

    .line 250
    goto :goto_0

    .line 251
    :goto_1
    iget v15, v4, LA3/p;->i:I

    .line 252
    .line 253
    if-ne v15, v5, :cond_11

    .line 254
    .line 255
    move v5, v9

    .line 256
    goto :goto_2

    .line 257
    :cond_11
    move v5, v2

    .line 258
    :goto_2
    if-eqz v5, :cond_13

    .line 259
    .line 260
    invoke-virtual {v3}, LZ3/f;->e()Z

    .line 261
    .line 262
    .line 263
    move-result v15

    .line 264
    if-nez v15, :cond_12

    .line 265
    .line 266
    goto :goto_6

    .line 267
    :cond_12
    invoke-virtual {v3}, LZ3/f;->l()I

    .line 268
    .line 269
    .line 270
    move-result v15

    .line 271
    goto :goto_3

    .line 272
    :cond_13
    move v15, v2

    .line 273
    :goto_3
    iget-boolean v10, v10, Ll4/p;->b:Z

    .line 274
    .line 275
    iget v2, v11, Ll4/q;->k:I

    .line 276
    .line 277
    if-nez v2, :cond_17

    .line 278
    .line 279
    iget v2, v11, Ll4/q;->l:I

    .line 280
    .line 281
    invoke-virtual {v3, v2}, LZ3/f;->d(I)Z

    .line 282
    .line 283
    .line 284
    move-result v16

    .line 285
    if-nez v16, :cond_14

    .line 286
    .line 287
    goto :goto_6

    .line 288
    :cond_14
    invoke-virtual {v3, v2}, LZ3/f;->i(I)I

    .line 289
    .line 290
    .line 291
    move-result v2

    .line 292
    if-eqz v10, :cond_16

    .line 293
    .line 294
    if-nez v12, :cond_16

    .line 295
    .line 296
    invoke-virtual {v3}, LZ3/f;->e()Z

    .line 297
    .line 298
    .line 299
    move-result v10

    .line 300
    if-nez v10, :cond_15

    .line 301
    .line 302
    goto :goto_6

    .line 303
    :cond_15
    invoke-virtual {v3}, LZ3/f;->m()I

    .line 304
    .line 305
    .line 306
    move-result v3

    .line 307
    move v10, v3

    .line 308
    const/4 v3, 0x0

    .line 309
    const/4 v9, 0x0

    .line 310
    goto :goto_7

    .line 311
    :cond_16
    :goto_4
    const/4 v3, 0x0

    .line 312
    :goto_5
    const/4 v9, 0x0

    .line 313
    const/4 v10, 0x0

    .line 314
    goto :goto_7

    .line 315
    :cond_17
    if-ne v2, v9, :cond_1b

    .line 316
    .line 317
    iget-boolean v2, v11, Ll4/q;->m:Z

    .line 318
    .line 319
    if-nez v2, :cond_1b

    .line 320
    .line 321
    invoke-virtual {v3}, LZ3/f;->e()Z

    .line 322
    .line 323
    .line 324
    move-result v2

    .line 325
    if-nez v2, :cond_18

    .line 326
    .line 327
    goto :goto_6

    .line 328
    :cond_18
    invoke-virtual {v3}, LZ3/f;->m()I

    .line 329
    .line 330
    .line 331
    move-result v2

    .line 332
    if-eqz v10, :cond_1a

    .line 333
    .line 334
    if-nez v12, :cond_1a

    .line 335
    .line 336
    invoke-virtual {v3}, LZ3/f;->e()Z

    .line 337
    .line 338
    .line 339
    move-result v10

    .line 340
    if-nez v10, :cond_19

    .line 341
    .line 342
    :goto_6
    return-void

    .line 343
    :cond_19
    invoke-virtual {v3}, LZ3/f;->m()I

    .line 344
    .line 345
    .line 346
    move-result v3

    .line 347
    move v9, v3

    .line 348
    const/4 v10, 0x0

    .line 349
    move v3, v2

    .line 350
    const/4 v2, 0x0

    .line 351
    goto :goto_7

    .line 352
    :cond_1a
    move v3, v2

    .line 353
    const/4 v2, 0x0

    .line 354
    goto :goto_5

    .line 355
    :cond_1b
    const/4 v2, 0x0

    .line 356
    goto :goto_4

    .line 357
    :goto_7
    iget-object v0, v4, LA3/p;->n:LA3/o;

    .line 358
    .line 359
    iput-object v11, v0, LA3/o;->c:Ll4/q;

    .line 360
    .line 361
    iput v1, v0, LA3/o;->d:I

    .line 362
    .line 363
    iput v6, v0, LA3/o;->e:I

    .line 364
    .line 365
    iput v8, v0, LA3/o;->f:I

    .line 366
    .line 367
    iput v7, v0, LA3/o;->g:I

    .line 368
    .line 369
    iput-boolean v12, v0, LA3/o;->h:Z

    .line 370
    .line 371
    iput-boolean v14, v0, LA3/o;->i:Z

    .line 372
    .line 373
    iput-boolean v13, v0, LA3/o;->j:Z

    .line 374
    .line 375
    iput-boolean v5, v0, LA3/o;->k:Z

    .line 376
    .line 377
    iput v15, v0, LA3/o;->l:I

    .line 378
    .line 379
    iput v2, v0, LA3/o;->m:I

    .line 380
    .line 381
    iput v10, v0, LA3/o;->n:I

    .line 382
    .line 383
    iput v3, v0, LA3/o;->o:I

    .line 384
    .line 385
    iput v9, v0, LA3/o;->p:I

    .line 386
    .line 387
    const/4 v1, 0x1

    .line 388
    iput-boolean v1, v0, LA3/o;->a:Z

    .line 389
    .line 390
    iput-boolean v1, v0, LA3/o;->b:Z

    .line 391
    .line 392
    const/4 v0, 0x0

    .line 393
    iput-boolean v0, v4, LA3/p;->k:Z

    .line 394
    .line 395
    return-void
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
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
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
.end method

.method public final c(LA4/r;)V
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    iget-object v3, v0, LA3/q;->j:Lq3/u;

    .line 7
    .line 8
    invoke-static {v3}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    sget v3, Ll4/y;->a:I

    .line 12
    .line 13
    iget v3, v1, LA4/r;->a:I

    .line 14
    .line 15
    iget v4, v1, LA4/r;->b:I

    .line 16
    .line 17
    iget-object v5, v1, LA4/r;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v5, [B

    .line 20
    .line 21
    iget-wide v6, v0, LA3/q;->g:J

    .line 22
    .line 23
    invoke-virtual {v1}, LA4/r;->e()I

    .line 24
    .line 25
    .line 26
    move-result v8

    .line 27
    int-to-long v8, v8

    .line 28
    add-long/2addr v6, v8

    .line 29
    iput-wide v6, v0, LA3/q;->g:J

    .line 30
    .line 31
    iget-object v6, v0, LA3/q;->j:Lq3/u;

    .line 32
    .line 33
    invoke-virtual {v1}, LA4/r;->e()I

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    invoke-interface {v6, v7, v1}, Lq3/u;->c(ILA4/r;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    iget-object v1, v0, LA3/q;->h:[Z

    .line 41
    .line 42
    invoke-static {v5, v3, v4, v1}, Ll4/a;->w([BII[Z)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-ne v1, v4, :cond_0

    .line 47
    .line 48
    invoke-virtual {v0, v5, v3, v4}, LA3/q;->b([BII)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_0
    add-int/lit8 v6, v1, 0x3

    .line 53
    .line 54
    aget-byte v7, v5, v6

    .line 55
    .line 56
    and-int/lit8 v7, v7, 0x1f

    .line 57
    .line 58
    sub-int v8, v1, v3

    .line 59
    .line 60
    if-lez v8, :cond_1

    .line 61
    .line 62
    invoke-virtual {v0, v5, v3, v1}, LA3/q;->b([BII)V

    .line 63
    .line 64
    .line 65
    :cond_1
    sub-int v1, v4, v1

    .line 66
    .line 67
    iget-wide v9, v0, LA3/q;->g:J

    .line 68
    .line 69
    int-to-long v11, v1

    .line 70
    sub-long/2addr v9, v11

    .line 71
    if-gez v8, :cond_2

    .line 72
    .line 73
    neg-int v8, v8

    .line 74
    goto :goto_1

    .line 75
    :cond_2
    const/4 v8, 0x0

    .line 76
    :goto_1
    iget-wide v11, v0, LA3/q;->m:J

    .line 77
    .line 78
    iget-boolean v13, v0, LA3/q;->l:Z

    .line 79
    .line 80
    iget-object v15, v0, LA3/q;->e:LA3/v;

    .line 81
    .line 82
    iget-object v3, v0, LA3/q;->d:LA3/v;

    .line 83
    .line 84
    if-eqz v13, :cond_4

    .line 85
    .line 86
    iget-object v13, v0, LA3/q;->k:LA3/p;

    .line 87
    .line 88
    iget-boolean v13, v13, LA3/p;->c:Z

    .line 89
    .line 90
    if-eqz v13, :cond_3

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_3
    move/from16 v16, v1

    .line 94
    .line 95
    move/from16 v17, v4

    .line 96
    .line 97
    move-object/from16 v18, v5

    .line 98
    .line 99
    move/from16 v19, v6

    .line 100
    .line 101
    move-wide/from16 v20, v9

    .line 102
    .line 103
    move v4, v2

    .line 104
    goto/16 :goto_3

    .line 105
    .line 106
    :cond_4
    :goto_2
    invoke-virtual {v3, v8}, LA3/v;->e(I)Z

    .line 107
    .line 108
    .line 109
    invoke-virtual {v15, v8}, LA3/v;->e(I)Z

    .line 110
    .line 111
    .line 112
    iget-boolean v13, v0, LA3/q;->l:Z

    .line 113
    .line 114
    if-nez v13, :cond_5

    .line 115
    .line 116
    iget-boolean v13, v3, LA3/v;->e:Z

    .line 117
    .line 118
    if-eqz v13, :cond_3

    .line 119
    .line 120
    iget-boolean v13, v15, LA3/v;->e:Z

    .line 121
    .line 122
    if-eqz v13, :cond_3

    .line 123
    .line 124
    new-instance v13, Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 127
    .line 128
    .line 129
    iget-object v14, v3, LA3/v;->f:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v14, [B

    .line 132
    .line 133
    iget v2, v3, LA3/v;->c:I

    .line 134
    .line 135
    invoke-static {v14, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    iget-object v2, v15, LA3/v;->f:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v2, [B

    .line 145
    .line 146
    iget v14, v15, LA3/v;->c:I

    .line 147
    .line 148
    invoke-static {v2, v14}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    iget-object v2, v3, LA3/v;->f:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v2, [B

    .line 158
    .line 159
    iget v14, v3, LA3/v;->c:I

    .line 160
    .line 161
    move/from16 v16, v1

    .line 162
    .line 163
    const/4 v1, 0x3

    .line 164
    invoke-static {v2, v1, v14}, Ll4/a;->H([BII)Ll4/q;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    iget-object v1, v15, LA3/v;->f:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v1, [B

    .line 171
    .line 172
    iget v14, v15, LA3/v;->c:I

    .line 173
    .line 174
    move/from16 v17, v4

    .line 175
    .line 176
    new-instance v4, LZ3/f;

    .line 177
    .line 178
    move-object/from16 v18, v5

    .line 179
    .line 180
    const/4 v5, 0x4

    .line 181
    invoke-direct {v4, v1, v5, v14}, LZ3/f;-><init>([BII)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v4}, LZ3/f;->l()I

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    invoke-virtual {v4}, LZ3/f;->l()I

    .line 189
    .line 190
    .line 191
    move-result v5

    .line 192
    invoke-virtual {v4}, LZ3/f;->q()V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v4}, LZ3/f;->h()Z

    .line 196
    .line 197
    .line 198
    move-result v4

    .line 199
    new-instance v14, Ll4/p;

    .line 200
    .line 201
    invoke-direct {v14, v1, v5, v4}, Ll4/p;-><init>(IIZ)V

    .line 202
    .line 203
    .line 204
    iget v4, v2, Ll4/q;->a:I

    .line 205
    .line 206
    iget v5, v2, Ll4/q;->b:I

    .line 207
    .line 208
    move/from16 v19, v6

    .line 209
    .line 210
    iget v6, v2, Ll4/q;->c:I

    .line 211
    .line 212
    invoke-static {v4, v5, v6}, Ll4/a;->e(III)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    iget-object v5, v0, LA3/q;->j:Lq3/u;

    .line 217
    .line 218
    new-instance v6, Lj3/L;

    .line 219
    .line 220
    invoke-direct {v6}, Lj3/L;-><init>()V

    .line 221
    .line 222
    .line 223
    move-wide/from16 v20, v9

    .line 224
    .line 225
    iget-object v9, v0, LA3/q;->i:Ljava/lang/String;

    .line 226
    .line 227
    iput-object v9, v6, Lj3/L;->a:Ljava/lang/String;

    .line 228
    .line 229
    const-string v9, "video/avc"

    .line 230
    .line 231
    iput-object v9, v6, Lj3/L;->k:Ljava/lang/String;

    .line 232
    .line 233
    iput-object v4, v6, Lj3/L;->h:Ljava/lang/String;

    .line 234
    .line 235
    iget v4, v2, Ll4/q;->e:I

    .line 236
    .line 237
    iput v4, v6, Lj3/L;->p:I

    .line 238
    .line 239
    iget v4, v2, Ll4/q;->f:I

    .line 240
    .line 241
    iput v4, v6, Lj3/L;->q:I

    .line 242
    .line 243
    iget v4, v2, Ll4/q;->g:F

    .line 244
    .line 245
    iput v4, v6, Lj3/L;->t:F

    .line 246
    .line 247
    iput-object v13, v6, Lj3/L;->m:Ljava/util/List;

    .line 248
    .line 249
    invoke-static {v6, v5}, Lcom/google/android/gms/internal/measurement/k1;->u(Lj3/L;Lq3/u;)V

    .line 250
    .line 251
    .line 252
    const/4 v4, 0x1

    .line 253
    iput-boolean v4, v0, LA3/q;->l:Z

    .line 254
    .line 255
    iget-object v4, v0, LA3/q;->k:LA3/p;

    .line 256
    .line 257
    iget-object v4, v4, LA3/p;->d:Landroid/util/SparseArray;

    .line 258
    .line 259
    iget v5, v2, Ll4/q;->d:I

    .line 260
    .line 261
    invoke-virtual {v4, v5, v2}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    iget-object v2, v0, LA3/q;->k:LA3/p;

    .line 265
    .line 266
    iget-object v2, v2, LA3/p;->e:Landroid/util/SparseArray;

    .line 267
    .line 268
    invoke-virtual {v2, v1, v14}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v3}, LA3/v;->f()V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v15}, LA3/v;->f()V

    .line 275
    .line 276
    .line 277
    const/4 v4, 0x3

    .line 278
    goto :goto_3

    .line 279
    :cond_5
    move/from16 v16, v1

    .line 280
    .line 281
    move/from16 v17, v4

    .line 282
    .line 283
    move-object/from16 v18, v5

    .line 284
    .line 285
    move/from16 v19, v6

    .line 286
    .line 287
    move-wide/from16 v20, v9

    .line 288
    .line 289
    iget-boolean v1, v3, LA3/v;->e:Z

    .line 290
    .line 291
    if-eqz v1, :cond_6

    .line 292
    .line 293
    iget-object v1, v3, LA3/v;->f:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast v1, [B

    .line 296
    .line 297
    iget v2, v3, LA3/v;->c:I

    .line 298
    .line 299
    const/4 v4, 0x3

    .line 300
    invoke-static {v1, v4, v2}, Ll4/a;->H([BII)Ll4/q;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    iget-object v2, v0, LA3/q;->k:LA3/p;

    .line 305
    .line 306
    iget-object v2, v2, LA3/p;->d:Landroid/util/SparseArray;

    .line 307
    .line 308
    iget v5, v1, Ll4/q;->d:I

    .line 309
    .line 310
    invoke-virtual {v2, v5, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v3}, LA3/v;->f()V

    .line 314
    .line 315
    .line 316
    goto :goto_3

    .line 317
    :cond_6
    const/4 v4, 0x3

    .line 318
    iget-boolean v1, v15, LA3/v;->e:Z

    .line 319
    .line 320
    if-eqz v1, :cond_7

    .line 321
    .line 322
    iget-object v1, v15, LA3/v;->f:Ljava/lang/Object;

    .line 323
    .line 324
    check-cast v1, [B

    .line 325
    .line 326
    iget v2, v15, LA3/v;->c:I

    .line 327
    .line 328
    new-instance v5, LZ3/f;

    .line 329
    .line 330
    const/4 v6, 0x4

    .line 331
    invoke-direct {v5, v1, v6, v2}, LZ3/f;-><init>([BII)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v5}, LZ3/f;->l()I

    .line 335
    .line 336
    .line 337
    move-result v1

    .line 338
    invoke-virtual {v5}, LZ3/f;->l()I

    .line 339
    .line 340
    .line 341
    move-result v2

    .line 342
    invoke-virtual {v5}, LZ3/f;->q()V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v5}, LZ3/f;->h()Z

    .line 346
    .line 347
    .line 348
    move-result v5

    .line 349
    new-instance v6, Ll4/p;

    .line 350
    .line 351
    invoke-direct {v6, v1, v2, v5}, Ll4/p;-><init>(IIZ)V

    .line 352
    .line 353
    .line 354
    iget-object v2, v0, LA3/q;->k:LA3/p;

    .line 355
    .line 356
    iget-object v2, v2, LA3/p;->e:Landroid/util/SparseArray;

    .line 357
    .line 358
    invoke-virtual {v2, v1, v6}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 359
    .line 360
    .line 361
    invoke-virtual {v15}, LA3/v;->f()V

    .line 362
    .line 363
    .line 364
    :cond_7
    :goto_3
    iget-object v1, v0, LA3/q;->f:LA3/v;

    .line 365
    .line 366
    invoke-virtual {v1, v8}, LA3/v;->e(I)Z

    .line 367
    .line 368
    .line 369
    move-result v2

    .line 370
    if-eqz v2, :cond_8

    .line 371
    .line 372
    iget-object v2, v1, LA3/v;->f:Ljava/lang/Object;

    .line 373
    .line 374
    check-cast v2, [B

    .line 375
    .line 376
    iget v5, v1, LA3/v;->c:I

    .line 377
    .line 378
    invoke-static {v5, v2}, Ll4/a;->O(I[B)I

    .line 379
    .line 380
    .line 381
    move-result v2

    .line 382
    iget-object v5, v1, LA3/v;->f:Ljava/lang/Object;

    .line 383
    .line 384
    check-cast v5, [B

    .line 385
    .line 386
    iget-object v6, v0, LA3/q;->o:LA4/r;

    .line 387
    .line 388
    invoke-virtual {v6, v2, v5}, LA4/r;->F(I[B)V

    .line 389
    .line 390
    .line 391
    const/4 v5, 0x4

    .line 392
    invoke-virtual {v6, v5}, LA4/r;->H(I)V

    .line 393
    .line 394
    .line 395
    iget-object v2, v0, LA3/q;->a:LA3/D;

    .line 396
    .line 397
    iget-object v2, v2, LA3/D;->c:[Lq3/u;

    .line 398
    .line 399
    invoke-static {v11, v12, v6, v2}, La/a;->e(JLA4/r;[Lq3/u;)V

    .line 400
    .line 401
    .line 402
    :cond_8
    iget-object v2, v0, LA3/q;->k:LA3/p;

    .line 403
    .line 404
    iget-boolean v5, v0, LA3/q;->l:Z

    .line 405
    .line 406
    iget-boolean v6, v0, LA3/q;->n:Z

    .line 407
    .line 408
    iget v8, v2, LA3/p;->i:I

    .line 409
    .line 410
    const/16 v9, 0x9

    .line 411
    .line 412
    if-eq v8, v9, :cond_f

    .line 413
    .line 414
    iget-boolean v8, v2, LA3/p;->c:Z

    .line 415
    .line 416
    if-eqz v8, :cond_12

    .line 417
    .line 418
    iget-object v8, v2, LA3/p;->n:LA3/o;

    .line 419
    .line 420
    iget-object v9, v2, LA3/p;->m:LA3/o;

    .line 421
    .line 422
    iget-boolean v10, v8, LA3/o;->a:Z

    .line 423
    .line 424
    if-nez v10, :cond_9

    .line 425
    .line 426
    goto/16 :goto_6

    .line 427
    .line 428
    :cond_9
    iget-boolean v10, v9, LA3/o;->a:Z

    .line 429
    .line 430
    if-nez v10, :cond_a

    .line 431
    .line 432
    goto :goto_4

    .line 433
    :cond_a
    iget-object v10, v8, LA3/o;->c:Ll4/q;

    .line 434
    .line 435
    invoke-static {v10}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 436
    .line 437
    .line 438
    iget-object v11, v9, LA3/o;->c:Ll4/q;

    .line 439
    .line 440
    invoke-static {v11}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 441
    .line 442
    .line 443
    iget v12, v8, LA3/o;->f:I

    .line 444
    .line 445
    iget v13, v9, LA3/o;->f:I

    .line 446
    .line 447
    if-ne v12, v13, :cond_f

    .line 448
    .line 449
    iget v12, v8, LA3/o;->g:I

    .line 450
    .line 451
    iget v13, v9, LA3/o;->g:I

    .line 452
    .line 453
    if-ne v12, v13, :cond_f

    .line 454
    .line 455
    iget-boolean v12, v8, LA3/o;->h:Z

    .line 456
    .line 457
    iget-boolean v13, v9, LA3/o;->h:Z

    .line 458
    .line 459
    if-ne v12, v13, :cond_f

    .line 460
    .line 461
    iget-boolean v12, v8, LA3/o;->i:Z

    .line 462
    .line 463
    if-eqz v12, :cond_b

    .line 464
    .line 465
    iget-boolean v12, v9, LA3/o;->i:Z

    .line 466
    .line 467
    if-eqz v12, :cond_b

    .line 468
    .line 469
    iget-boolean v12, v8, LA3/o;->j:Z

    .line 470
    .line 471
    iget-boolean v13, v9, LA3/o;->j:Z

    .line 472
    .line 473
    if-ne v12, v13, :cond_f

    .line 474
    .line 475
    :cond_b
    iget v12, v8, LA3/o;->d:I

    .line 476
    .line 477
    iget v13, v9, LA3/o;->d:I

    .line 478
    .line 479
    if-eq v12, v13, :cond_c

    .line 480
    .line 481
    if-eqz v12, :cond_f

    .line 482
    .line 483
    if-eqz v13, :cond_f

    .line 484
    .line 485
    :cond_c
    iget v11, v11, Ll4/q;->k:I

    .line 486
    .line 487
    iget v10, v10, Ll4/q;->k:I

    .line 488
    .line 489
    if-nez v10, :cond_d

    .line 490
    .line 491
    if-nez v11, :cond_d

    .line 492
    .line 493
    iget v12, v8, LA3/o;->m:I

    .line 494
    .line 495
    iget v13, v9, LA3/o;->m:I

    .line 496
    .line 497
    if-ne v12, v13, :cond_f

    .line 498
    .line 499
    iget v12, v8, LA3/o;->n:I

    .line 500
    .line 501
    iget v13, v9, LA3/o;->n:I

    .line 502
    .line 503
    if-ne v12, v13, :cond_f

    .line 504
    .line 505
    :cond_d
    const/4 v12, 0x1

    .line 506
    if-ne v10, v12, :cond_e

    .line 507
    .line 508
    if-ne v11, v12, :cond_e

    .line 509
    .line 510
    iget v10, v8, LA3/o;->o:I

    .line 511
    .line 512
    iget v11, v9, LA3/o;->o:I

    .line 513
    .line 514
    if-ne v10, v11, :cond_f

    .line 515
    .line 516
    iget v10, v8, LA3/o;->p:I

    .line 517
    .line 518
    iget v11, v9, LA3/o;->p:I

    .line 519
    .line 520
    if-ne v10, v11, :cond_f

    .line 521
    .line 522
    :cond_e
    iget-boolean v10, v8, LA3/o;->k:Z

    .line 523
    .line 524
    iget-boolean v11, v9, LA3/o;->k:Z

    .line 525
    .line 526
    if-ne v10, v11, :cond_f

    .line 527
    .line 528
    if-eqz v10, :cond_12

    .line 529
    .line 530
    iget v8, v8, LA3/o;->l:I

    .line 531
    .line 532
    iget v9, v9, LA3/o;->l:I

    .line 533
    .line 534
    if-eq v8, v9, :cond_12

    .line 535
    .line 536
    :cond_f
    :goto_4
    if-eqz v5, :cond_11

    .line 537
    .line 538
    iget-boolean v5, v2, LA3/p;->o:Z

    .line 539
    .line 540
    if-eqz v5, :cond_11

    .line 541
    .line 542
    iget-wide v8, v2, LA3/p;->j:J

    .line 543
    .line 544
    sub-long v10, v20, v8

    .line 545
    .line 546
    long-to-int v5, v10

    .line 547
    add-int v27, v16, v5

    .line 548
    .line 549
    iget-wide v10, v2, LA3/p;->q:J

    .line 550
    .line 551
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    cmp-long v5, v10, v12

    .line 557
    .line 558
    if-nez v5, :cond_10

    .line 559
    .line 560
    goto :goto_5

    .line 561
    :cond_10
    iget-boolean v5, v2, LA3/p;->r:Z

    .line 562
    .line 563
    iget-wide v12, v2, LA3/p;->p:J

    .line 564
    .line 565
    sub-long/2addr v8, v12

    .line 566
    long-to-int v8, v8

    .line 567
    iget-object v9, v2, LA3/p;->a:Lq3/u;

    .line 568
    .line 569
    const/16 v28, 0x0

    .line 570
    .line 571
    move/from16 v25, v5

    .line 572
    .line 573
    move/from16 v26, v8

    .line 574
    .line 575
    move-object/from16 v22, v9

    .line 576
    .line 577
    move-wide/from16 v23, v10

    .line 578
    .line 579
    invoke-interface/range {v22 .. v28}, Lq3/u;->d(JIIILq3/t;)V

    .line 580
    .line 581
    .line 582
    :cond_11
    :goto_5
    iget-wide v8, v2, LA3/p;->j:J

    .line 583
    .line 584
    iput-wide v8, v2, LA3/p;->p:J

    .line 585
    .line 586
    iget-wide v8, v2, LA3/p;->l:J

    .line 587
    .line 588
    iput-wide v8, v2, LA3/p;->q:J

    .line 589
    .line 590
    const/4 v5, 0x0

    .line 591
    iput-boolean v5, v2, LA3/p;->r:Z

    .line 592
    .line 593
    const/4 v12, 0x1

    .line 594
    iput-boolean v12, v2, LA3/p;->o:Z

    .line 595
    .line 596
    :cond_12
    :goto_6
    iget-boolean v5, v2, LA3/p;->b:Z

    .line 597
    .line 598
    const/4 v8, 0x2

    .line 599
    if-eqz v5, :cond_15

    .line 600
    .line 601
    iget-object v5, v2, LA3/p;->n:LA3/o;

    .line 602
    .line 603
    iget-boolean v6, v5, LA3/o;->b:Z

    .line 604
    .line 605
    if-eqz v6, :cond_14

    .line 606
    .line 607
    iget v5, v5, LA3/o;->e:I

    .line 608
    .line 609
    const/4 v6, 0x7

    .line 610
    if-eq v5, v6, :cond_13

    .line 611
    .line 612
    if-ne v5, v8, :cond_14

    .line 613
    .line 614
    :cond_13
    const/4 v5, 0x1

    .line 615
    goto :goto_7

    .line 616
    :cond_14
    const/4 v5, 0x0

    .line 617
    :goto_7
    move v6, v5

    .line 618
    :cond_15
    iget-boolean v5, v2, LA3/p;->r:Z

    .line 619
    .line 620
    iget v9, v2, LA3/p;->i:I

    .line 621
    .line 622
    const/4 v10, 0x5

    .line 623
    if-eq v9, v10, :cond_17

    .line 624
    .line 625
    if-eqz v6, :cond_16

    .line 626
    .line 627
    const/4 v12, 0x1

    .line 628
    if-ne v9, v12, :cond_16

    .line 629
    .line 630
    goto :goto_8

    .line 631
    :cond_16
    const/4 v6, 0x0

    .line 632
    goto :goto_9

    .line 633
    :cond_17
    :goto_8
    const/4 v6, 0x1

    .line 634
    :goto_9
    or-int/2addr v5, v6

    .line 635
    iput-boolean v5, v2, LA3/p;->r:Z

    .line 636
    .line 637
    if-eqz v5, :cond_18

    .line 638
    .line 639
    const/4 v5, 0x0

    .line 640
    iput-boolean v5, v0, LA3/q;->n:Z

    .line 641
    .line 642
    :cond_18
    iget-wide v5, v0, LA3/q;->m:J

    .line 643
    .line 644
    iget-boolean v2, v0, LA3/q;->l:Z

    .line 645
    .line 646
    if-eqz v2, :cond_19

    .line 647
    .line 648
    iget-object v2, v0, LA3/q;->k:LA3/p;

    .line 649
    .line 650
    iget-boolean v2, v2, LA3/p;->c:Z

    .line 651
    .line 652
    if-eqz v2, :cond_1a

    .line 653
    .line 654
    :cond_19
    invoke-virtual {v3, v7}, LA3/v;->g(I)V

    .line 655
    .line 656
    .line 657
    invoke-virtual {v15, v7}, LA3/v;->g(I)V

    .line 658
    .line 659
    .line 660
    :cond_1a
    invoke-virtual {v1, v7}, LA3/v;->g(I)V

    .line 661
    .line 662
    .line 663
    iget-object v1, v0, LA3/q;->k:LA3/p;

    .line 664
    .line 665
    iput v7, v1, LA3/p;->i:I

    .line 666
    .line 667
    iput-wide v5, v1, LA3/p;->l:J

    .line 668
    .line 669
    move-wide/from16 v2, v20

    .line 670
    .line 671
    iput-wide v2, v1, LA3/p;->j:J

    .line 672
    .line 673
    iget-boolean v2, v1, LA3/p;->b:Z

    .line 674
    .line 675
    const/4 v12, 0x1

    .line 676
    if-eqz v2, :cond_1b

    .line 677
    .line 678
    if-eq v7, v12, :cond_1c

    .line 679
    .line 680
    :cond_1b
    iget-boolean v2, v1, LA3/p;->c:Z

    .line 681
    .line 682
    if-eqz v2, :cond_1d

    .line 683
    .line 684
    if-eq v7, v10, :cond_1c

    .line 685
    .line 686
    if-eq v7, v12, :cond_1c

    .line 687
    .line 688
    if-ne v7, v8, :cond_1d

    .line 689
    .line 690
    :cond_1c
    iget-object v2, v1, LA3/p;->m:LA3/o;

    .line 691
    .line 692
    iget-object v3, v1, LA3/p;->n:LA3/o;

    .line 693
    .line 694
    iput-object v3, v1, LA3/p;->m:LA3/o;

    .line 695
    .line 696
    iput-object v2, v1, LA3/p;->n:LA3/o;

    .line 697
    .line 698
    const/4 v5, 0x0

    .line 699
    iput-boolean v5, v2, LA3/o;->b:Z

    .line 700
    .line 701
    iput-boolean v5, v2, LA3/o;->a:Z

    .line 702
    .line 703
    iput v5, v1, LA3/p;->h:I

    .line 704
    .line 705
    const/4 v12, 0x1

    .line 706
    iput-boolean v12, v1, LA3/p;->k:Z

    .line 707
    .line 708
    :cond_1d
    move v2, v4

    .line 709
    move/from16 v4, v17

    .line 710
    .line 711
    move-object/from16 v5, v18

    .line 712
    .line 713
    move/from16 v3, v19

    .line 714
    .line 715
    goto/16 :goto_0
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

.method public final d()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
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

.method public final e(JI)V
    .locals 2

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long v0, p1, v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iput-wide p1, p0, LA3/q;->m:J

    .line 11
    .line 12
    :cond_0
    iget-boolean p1, p0, LA3/q;->n:Z

    .line 13
    .line 14
    and-int/lit8 p2, p3, 0x2

    .line 15
    .line 16
    if-eqz p2, :cond_1

    .line 17
    .line 18
    const/4 p2, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 p2, 0x0

    .line 21
    :goto_0
    or-int/2addr p1, p2

    .line 22
    iput-boolean p1, p0, LA3/q;->n:Z

    .line 23
    .line 24
    return-void
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

.method public final f(Lq3/l;LA3/I;)V
    .locals 4

    .line 1
    invoke-virtual {p2}, LA3/I;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, LA3/I;->b()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p2, LA3/I;->e:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, LA3/q;->i:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p2}, LA3/I;->b()V

    .line 12
    .line 13
    .line 14
    iget v0, p2, LA3/I;->d:I

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    invoke-interface {p1, v0, v1}, Lq3/l;->u(II)Lq3/u;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, LA3/q;->j:Lq3/u;

    .line 22
    .line 23
    new-instance v1, LA3/p;

    .line 24
    .line 25
    iget-boolean v2, p0, LA3/q;->b:Z

    .line 26
    .line 27
    iget-boolean v3, p0, LA3/q;->c:Z

    .line 28
    .line 29
    invoke-direct {v1, v0, v2, v3}, LA3/p;-><init>(Lq3/u;ZZ)V

    .line 30
    .line 31
    .line 32
    iput-object v1, p0, LA3/q;->k:LA3/p;

    .line 33
    .line 34
    iget-object v0, p0, LA3/q;->a:LA3/D;

    .line 35
    .line 36
    invoke-virtual {v0, p1, p2}, LA3/D;->b(Lq3/l;LA3/I;)V

    .line 37
    .line 38
    .line 39
    return-void
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
