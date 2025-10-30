.class public abstract LW/g;
.super Lv4/e;
.source "SourceFile"


# static fields
.field public static final s:Z = true

.field public static final t:Ljava/lang/ref/ReferenceQueue;

.field public static final u:LW/d;


# instance fields
.field public final h:LA4/e;

.field public i:Z

.field public final j:[LW/h;

.field public final k:Landroid/view/View;

.field public l:Z

.field public final m:Landroid/view/Choreographer;

.field public final n:LW/e;

.field public final o:Landroid/os/Handler;

.field public p:LW/g;

.field public q:Ljava/lang/Object;

.field public r:LW/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/ref/ReferenceQueue;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LW/g;->t:Ljava/lang/ref/ReferenceQueue;

    .line 7
    .line 8
    new-instance v0, LW/d;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, LW/d;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, LW/g;->u:LW/d;

    .line 15
    .line 16
    return-void
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

.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;I)V
    .locals 1

    .line 1
    if-nez p1, :cond_2

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, LA4/e;

    .line 7
    .line 8
    const/16 v0, 0x9

    .line 9
    .line 10
    invoke-direct {p1, v0, p0}, LA4/e;-><init>(ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, LW/g;->h:LA4/e;

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput-boolean p1, p0, LW/g;->i:Z

    .line 17
    .line 18
    new-array p1, p3, [LW/h;

    .line 19
    .line 20
    iput-object p1, p0, LW/g;->j:[LW/h;

    .line 21
    .line 22
    iput-object p2, p0, LW/g;->k:Landroid/view/View;

    .line 23
    .line 24
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    sget-boolean p1, LW/g;->s:Z

    .line 31
    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, LW/g;->m:Landroid/view/Choreographer;

    .line 39
    .line 40
    new-instance p1, LW/e;

    .line 41
    .line 42
    const/4 p2, 0x0

    .line 43
    invoke-direct {p1, p2, p0}, LW/e;-><init>(ILjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, LW/g;->n:LW/e;

    .line 47
    .line 48
    return-void

    .line 49
    :cond_0
    const/4 p1, 0x0

    .line 50
    iput-object p1, p0, LW/g;->n:LW/e;

    .line 51
    .line 52
    new-instance p1, Landroid/os/Handler;

    .line 53
    .line 54
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 59
    .line 60
    .line 61
    iput-object p1, p0, LW/g;->o:Landroid/os/Handler;

    .line 62
    .line 63
    return-void

    .line 64
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 65
    .line 66
    const-string p2, "DataBinding must be created in view\'s UI Thread"

    .line 67
    .line 68
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw p1

    .line 72
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 73
    .line 74
    const-string p2, "The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent"

    .line 75
    .line 76
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw p1
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

.method public static f0(Landroid/view/View;[Ljava/lang/Object;Landroid/support/v4/media/session/y;Landroid/util/SparseIntArray;Z)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const v5, 0x7f0a00fd

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v5}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    check-cast v5, LW/g;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v5, 0x0

    .line 22
    :goto_0
    if-eqz v5, :cond_1

    .line 23
    .line 24
    goto/16 :goto_15

    .line 25
    .line 26
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    instance-of v6, v5, Ljava/lang/String;

    .line 31
    .line 32
    if-eqz v6, :cond_2

    .line 33
    .line 34
    check-cast v5, Ljava/lang/String;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    const/4 v5, 0x0

    .line 38
    :goto_1
    const/16 v6, 0x30

    .line 39
    .line 40
    const/4 v7, 0x0

    .line 41
    const/4 v8, 0x1

    .line 42
    const-string v9, "layout"

    .line 43
    .line 44
    const/4 v10, -0x1

    .line 45
    if-eqz p4, :cond_8

    .line 46
    .line 47
    if-eqz v5, :cond_8

    .line 48
    .line 49
    invoke-virtual {v5, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v11

    .line 53
    if-eqz v11, :cond_8

    .line 54
    .line 55
    const/16 v11, 0x5f

    .line 56
    .line 57
    invoke-virtual {v5, v11}, Ljava/lang/String;->lastIndexOf(I)I

    .line 58
    .line 59
    .line 60
    move-result v11

    .line 61
    if-lez v11, :cond_c

    .line 62
    .line 63
    add-int/2addr v11, v8

    .line 64
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 65
    .line 66
    .line 67
    move-result v12

    .line 68
    if-ne v12, v11, :cond_3

    .line 69
    .line 70
    goto :goto_6

    .line 71
    :cond_3
    move v13, v11

    .line 72
    :goto_2
    if-ge v13, v12, :cond_5

    .line 73
    .line 74
    invoke-virtual {v5, v13}, Ljava/lang/String;->charAt(I)C

    .line 75
    .line 76
    .line 77
    move-result v14

    .line 78
    invoke-static {v14}, Ljava/lang/Character;->isDigit(C)Z

    .line 79
    .line 80
    .line 81
    move-result v14

    .line 82
    if-nez v14, :cond_4

    .line 83
    .line 84
    goto :goto_6

    .line 85
    :cond_4
    add-int/lit8 v13, v13, 0x1

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_5
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 89
    .line 90
    .line 91
    move-result v12

    .line 92
    move v13, v7

    .line 93
    :goto_3
    if-ge v11, v12, :cond_6

    .line 94
    .line 95
    mul-int/lit8 v13, v13, 0xa

    .line 96
    .line 97
    invoke-virtual {v5, v11}, Ljava/lang/String;->charAt(I)C

    .line 98
    .line 99
    .line 100
    move-result v14

    .line 101
    sub-int/2addr v14, v6

    .line 102
    add-int/2addr v13, v14

    .line 103
    add-int/lit8 v11, v11, 0x1

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_6
    aget-object v5, v1, v13

    .line 107
    .line 108
    if-nez v5, :cond_7

    .line 109
    .line 110
    aput-object v0, v1, v13

    .line 111
    .line 112
    :cond_7
    if-nez v2, :cond_b

    .line 113
    .line 114
    goto :goto_5

    .line 115
    :cond_8
    if-eqz v5, :cond_c

    .line 116
    .line 117
    const-string v11, "binding_"

    .line 118
    .line 119
    invoke-virtual {v5, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 120
    .line 121
    .line 122
    move-result v11

    .line 123
    if-eqz v11, :cond_c

    .line 124
    .line 125
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 126
    .line 127
    .line 128
    move-result v11

    .line 129
    const/16 v12, 0x8

    .line 130
    .line 131
    move v13, v7

    .line 132
    :goto_4
    if-ge v12, v11, :cond_9

    .line 133
    .line 134
    mul-int/lit8 v13, v13, 0xa

    .line 135
    .line 136
    invoke-virtual {v5, v12}, Ljava/lang/String;->charAt(I)C

    .line 137
    .line 138
    .line 139
    move-result v14

    .line 140
    sub-int/2addr v14, v6

    .line 141
    add-int/2addr v13, v14

    .line 142
    add-int/lit8 v12, v12, 0x1

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_9
    aget-object v5, v1, v13

    .line 146
    .line 147
    if-nez v5, :cond_a

    .line 148
    .line 149
    aput-object v0, v1, v13

    .line 150
    .line 151
    :cond_a
    if-nez v2, :cond_b

    .line 152
    .line 153
    :goto_5
    move v13, v10

    .line 154
    :cond_b
    move v5, v8

    .line 155
    goto :goto_7

    .line 156
    :cond_c
    :goto_6
    move v5, v7

    .line 157
    move v13, v10

    .line 158
    :goto_7
    if-nez v5, :cond_d

    .line 159
    .line 160
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    if-lez v5, :cond_d

    .line 165
    .line 166
    if-eqz v3, :cond_d

    .line 167
    .line 168
    invoke-virtual {v3, v5, v10}, Landroid/util/SparseIntArray;->get(II)I

    .line 169
    .line 170
    .line 171
    move-result v5

    .line 172
    if-ltz v5, :cond_d

    .line 173
    .line 174
    aget-object v11, v1, v5

    .line 175
    .line 176
    if-nez v11, :cond_d

    .line 177
    .line 178
    aput-object v0, v1, v5

    .line 179
    .line 180
    :cond_d
    instance-of v5, v0, Landroid/view/ViewGroup;

    .line 181
    .line 182
    if-eqz v5, :cond_1d

    .line 183
    .line 184
    check-cast v0, Landroid/view/ViewGroup;

    .line 185
    .line 186
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 187
    .line 188
    .line 189
    move-result v5

    .line 190
    move v11, v7

    .line 191
    move v12, v11

    .line 192
    :goto_8
    if-ge v11, v5, :cond_1d

    .line 193
    .line 194
    invoke-virtual {v0, v11}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 195
    .line 196
    .line 197
    move-result-object v14

    .line 198
    if-ltz v13, :cond_1b

    .line 199
    .line 200
    invoke-virtual {v14}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v15

    .line 204
    instance-of v15, v15, Ljava/lang/String;

    .line 205
    .line 206
    if-eqz v15, :cond_1b

    .line 207
    .line 208
    invoke-virtual {v14}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v15

    .line 212
    check-cast v15, Ljava/lang/String;

    .line 213
    .line 214
    const-string v4, "_0"

    .line 215
    .line 216
    invoke-virtual {v15, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 217
    .line 218
    .line 219
    move-result v4

    .line 220
    if-eqz v4, :cond_1b

    .line 221
    .line 222
    invoke-virtual {v15, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 223
    .line 224
    .line 225
    move-result v4

    .line 226
    if-eqz v4, :cond_1b

    .line 227
    .line 228
    const/16 v4, 0x2f

    .line 229
    .line 230
    invoke-virtual {v15, v4}, Ljava/lang/String;->indexOf(I)I

    .line 231
    .line 232
    .line 233
    move-result v16

    .line 234
    if-lez v16, :cond_1b

    .line 235
    .line 236
    invoke-virtual {v15, v4}, Ljava/lang/String;->indexOf(I)I

    .line 237
    .line 238
    .line 239
    move-result v4

    .line 240
    add-int/2addr v4, v8

    .line 241
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 242
    .line 243
    .line 244
    move-result v16

    .line 245
    move/from16 v17, v8

    .line 246
    .line 247
    add-int/lit8 v8, v16, -0x2

    .line 248
    .line 249
    invoke-virtual {v15, v4, v8}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    iget-object v8, v2, Landroid/support/v4/media/session/y;->b:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v8, [[Ljava/lang/String;

    .line 256
    .line 257
    aget-object v8, v8, v13

    .line 258
    .line 259
    array-length v15, v8

    .line 260
    move v10, v12

    .line 261
    :goto_9
    if-ge v10, v15, :cond_f

    .line 262
    .line 263
    aget-object v6, v8, v10

    .line 264
    .line 265
    invoke-static {v4, v6}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 266
    .line 267
    .line 268
    move-result v6

    .line 269
    if-eqz v6, :cond_e

    .line 270
    .line 271
    goto :goto_a

    .line 272
    :cond_e
    add-int/lit8 v10, v10, 0x1

    .line 273
    .line 274
    const/16 v6, 0x30

    .line 275
    .line 276
    goto :goto_9

    .line 277
    :cond_f
    const/4 v10, -0x1

    .line 278
    :goto_a
    if-ltz v10, :cond_1a

    .line 279
    .line 280
    add-int/lit8 v12, v10, 0x1

    .line 281
    .line 282
    iget-object v4, v2, Landroid/support/v4/media/session/y;->c:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v4, [[I

    .line 285
    .line 286
    aget-object v4, v4, v13

    .line 287
    .line 288
    aget v4, v4, v10

    .line 289
    .line 290
    iget-object v6, v2, Landroid/support/v4/media/session/y;->d:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast v6, [[I

    .line 293
    .line 294
    aget-object v6, v6, v13

    .line 295
    .line 296
    aget v6, v6, v10

    .line 297
    .line 298
    invoke-virtual {v0, v11}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 299
    .line 300
    .line 301
    move-result-object v8

    .line 302
    invoke-virtual {v8}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v8

    .line 306
    check-cast v8, Ljava/lang/String;

    .line 307
    .line 308
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 309
    .line 310
    .line 311
    move-result v10

    .line 312
    add-int/lit8 v10, v10, -0x1

    .line 313
    .line 314
    invoke-virtual {v8, v7, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v10

    .line 318
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 319
    .line 320
    .line 321
    move-result v15

    .line 322
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 323
    .line 324
    .line 325
    move-result v7

    .line 326
    add-int/lit8 v18, v11, 0x1

    .line 327
    .line 328
    move/from16 p0, v4

    .line 329
    .line 330
    move/from16 p4, v5

    .line 331
    .line 332
    move v5, v11

    .line 333
    move/from16 v4, v18

    .line 334
    .line 335
    :goto_b
    if-ge v4, v7, :cond_17

    .line 336
    .line 337
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 338
    .line 339
    .line 340
    move-result-object v18

    .line 341
    move/from16 v19, v4

    .line 342
    .line 343
    invoke-virtual/range {v18 .. v18}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v4

    .line 347
    instance-of v4, v4, Ljava/lang/String;

    .line 348
    .line 349
    if-eqz v4, :cond_10

    .line 350
    .line 351
    invoke-virtual/range {v18 .. v18}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v4

    .line 355
    check-cast v4, Ljava/lang/String;

    .line 356
    .line 357
    goto :goto_c

    .line 358
    :cond_10
    const/4 v4, 0x0

    .line 359
    :goto_c
    if-eqz v4, :cond_16

    .line 360
    .line 361
    invoke-virtual {v4, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 362
    .line 363
    .line 364
    move-result v18

    .line 365
    if-eqz v18, :cond_16

    .line 366
    .line 367
    move/from16 v18, v7

    .line 368
    .line 369
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 370
    .line 371
    .line 372
    move-result v7

    .line 373
    move-object/from16 v20, v8

    .line 374
    .line 375
    invoke-virtual/range {v20 .. v20}, Ljava/lang/String;->length()I

    .line 376
    .line 377
    .line 378
    move-result v8

    .line 379
    if-ne v7, v8, :cond_11

    .line 380
    .line 381
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 382
    .line 383
    .line 384
    move-result v7

    .line 385
    add-int/lit8 v7, v7, -0x1

    .line 386
    .line 387
    invoke-virtual {v4, v7}, Ljava/lang/String;->charAt(I)C

    .line 388
    .line 389
    .line 390
    move-result v7

    .line 391
    const/16 v8, 0x30

    .line 392
    .line 393
    if-ne v7, v8, :cond_12

    .line 394
    .line 395
    goto :goto_f

    .line 396
    :cond_11
    const/16 v8, 0x30

    .line 397
    .line 398
    :cond_12
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 399
    .line 400
    .line 401
    move-result v7

    .line 402
    if-ne v7, v15, :cond_13

    .line 403
    .line 404
    goto :goto_e

    .line 405
    :cond_13
    move v8, v15

    .line 406
    :goto_d
    if-ge v8, v7, :cond_15

    .line 407
    .line 408
    invoke-virtual {v4, v8}, Ljava/lang/String;->charAt(I)C

    .line 409
    .line 410
    .line 411
    move-result v21

    .line 412
    invoke-static/range {v21 .. v21}, Ljava/lang/Character;->isDigit(C)Z

    .line 413
    .line 414
    .line 415
    move-result v21

    .line 416
    if-nez v21, :cond_14

    .line 417
    .line 418
    goto :goto_e

    .line 419
    :cond_14
    add-int/lit8 v8, v8, 0x1

    .line 420
    .line 421
    goto :goto_d

    .line 422
    :cond_15
    move/from16 v5, v19

    .line 423
    .line 424
    goto :goto_e

    .line 425
    :cond_16
    move/from16 v18, v7

    .line 426
    .line 427
    move-object/from16 v20, v8

    .line 428
    .line 429
    :goto_e
    add-int/lit8 v4, v19, 0x1

    .line 430
    .line 431
    move/from16 v7, v18

    .line 432
    .line 433
    move-object/from16 v8, v20

    .line 434
    .line 435
    goto :goto_b

    .line 436
    :cond_17
    :goto_f
    if-ne v5, v11, :cond_18

    .line 437
    .line 438
    sget-object v4, LW/c;->a:Landroidx/databinding/DataBinderMapperImpl;

    .line 439
    .line 440
    invoke-virtual {v4, v14, v6}, Landroidx/databinding/MergedDataBinderMapper;->b(Landroid/view/View;I)LW/g;

    .line 441
    .line 442
    .line 443
    move-result-object v4

    .line 444
    aput-object v4, v1, p0

    .line 445
    .line 446
    :goto_10
    move/from16 v4, v17

    .line 447
    .line 448
    goto :goto_13

    .line 449
    :cond_18
    sub-int/2addr v5, v11

    .line 450
    add-int/lit8 v4, v5, 0x1

    .line 451
    .line 452
    new-array v7, v4, [Landroid/view/View;

    .line 453
    .line 454
    const/4 v8, 0x0

    .line 455
    :goto_11
    if-ge v8, v4, :cond_19

    .line 456
    .line 457
    add-int v10, v11, v8

    .line 458
    .line 459
    invoke-virtual {v0, v10}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 460
    .line 461
    .line 462
    move-result-object v10

    .line 463
    aput-object v10, v7, v8

    .line 464
    .line 465
    add-int/lit8 v8, v8, 0x1

    .line 466
    .line 467
    goto :goto_11

    .line 468
    :cond_19
    sget-object v4, LW/c;->a:Landroidx/databinding/DataBinderMapperImpl;

    .line 469
    .line 470
    invoke-virtual {v4, v7, v6}, Landroidx/databinding/MergedDataBinderMapper;->c([Landroid/view/View;I)LW/g;

    .line 471
    .line 472
    .line 473
    move-result-object v4

    .line 474
    aput-object v4, v1, p0

    .line 475
    .line 476
    add-int/2addr v11, v5

    .line 477
    goto :goto_10

    .line 478
    :cond_1a
    move/from16 p4, v5

    .line 479
    .line 480
    goto :goto_12

    .line 481
    :cond_1b
    move/from16 p4, v5

    .line 482
    .line 483
    move/from16 v17, v8

    .line 484
    .line 485
    :goto_12
    const/4 v4, 0x0

    .line 486
    :goto_13
    if-nez v4, :cond_1c

    .line 487
    .line 488
    const/4 v4, 0x0

    .line 489
    invoke-static {v14, v1, v2, v3, v4}, LW/g;->f0(Landroid/view/View;[Ljava/lang/Object;Landroid/support/v4/media/session/y;Landroid/util/SparseIntArray;Z)V

    .line 490
    .line 491
    .line 492
    goto :goto_14

    .line 493
    :cond_1c
    const/4 v4, 0x0

    .line 494
    :goto_14
    add-int/lit8 v11, v11, 0x1

    .line 495
    .line 496
    move/from16 v5, p4

    .line 497
    .line 498
    move v7, v4

    .line 499
    move/from16 v8, v17

    .line 500
    .line 501
    const/16 v6, 0x30

    .line 502
    .line 503
    const/4 v10, -0x1

    .line 504
    goto/16 :goto_8

    .line 505
    .line 506
    :cond_1d
    :goto_15
    return-void
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
.end method

.method public static g0(Landroid/view/View;ILandroid/support/v4/media/session/y;Landroid/util/SparseIntArray;)[Ljava/lang/Object;
    .locals 1

    .line 1
    new-array p1, p1, [Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-static {p0, p1, p2, p3, v0}, LW/g;->f0(Landroid/view/View;[Ljava/lang/Object;Landroid/support/v4/media/session/y;Landroid/util/SparseIntArray;Z)V

    .line 5
    .line 6
    .line 7
    return-object p1
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
.method public abstract a0()V
.end method

.method public final b0()V
    .locals 1

    .line 1
    iget-boolean v0, p0, LW/g;->l:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LW/g;->h0()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p0}, LW/g;->d0()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    const/4 v0, 0x1

    .line 17
    iput-boolean v0, p0, LW/g;->l:Z

    .line 18
    .line 19
    invoke-virtual {p0}, LW/g;->a0()V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput-boolean v0, p0, LW/g;->l:Z

    .line 24
    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final c0()V
    .locals 1

    .line 1
    iget-object v0, p0, LW/g;->p:LW/g;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LW/g;->b0()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {v0}, LW/g;->c0()V

    .line 10
    .line 11
    .line 12
    return-void
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

.method public abstract d0()Z
.end method

.method public abstract e0()V
.end method

.method public final h0()V
    .locals 2

    .line 1
    iget-object v0, p0, LW/g;->p:LW/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, LW/g;->h0()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, LW/g;->q:Ljava/lang/Object;

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    invoke-interface {v0}, Landroidx/lifecycle/w;->x()LD/n;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, LD/n;->a0()Landroidx/lifecycle/p;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget-object v1, Landroidx/lifecycle/p;->d:Landroidx/lifecycle/p;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-ltz v0, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    return-void

    .line 31
    :cond_2
    :goto_0
    monitor-enter p0

    .line 32
    :try_start_0
    iget-boolean v0, p0, LW/g;->i:Z

    .line 33
    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    monitor-exit p0

    .line 37
    return-void

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    goto :goto_1

    .line 40
    :cond_3
    const/4 v0, 0x1

    .line 41
    iput-boolean v0, p0, LW/g;->i:Z

    .line 42
    .line 43
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    sget-boolean v0, LW/g;->s:Z

    .line 45
    .line 46
    if-eqz v0, :cond_4

    .line 47
    .line 48
    iget-object v0, p0, LW/g;->m:Landroid/view/Choreographer;

    .line 49
    .line 50
    iget-object v1, p0, LW/g;->n:LW/e;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_4
    iget-object v0, p0, LW/g;->o:Landroid/os/Handler;

    .line 57
    .line 58
    iget-object v1, p0, LW/g;->h:LA4/e;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    throw v0
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

.method public i0(Landroidx/lifecycle/w;)V
    .locals 3

    .line 1
    instance-of v0, p1, Li0/v;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "DataBinding"

    .line 6
    .line 7
    const-string v1, "Setting the fragment as the LifecycleOwner might cause memory leaks because views lives shorter than the Fragment. Consider using Fragment\'s view lifecycle"

    .line 8
    .line 9
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, LW/g;->q:Ljava/lang/Object;

    .line 13
    .line 14
    if-ne v0, p1, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    if-eqz v0, :cond_2

    .line 18
    .line 19
    invoke-interface {v0}, Landroidx/lifecycle/w;->x()LD/n;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, p0, LW/g;->r:LW/f;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, LD/n;->g0(Landroidx/lifecycle/v;)V

    .line 26
    .line 27
    .line 28
    :cond_2
    iput-object p1, p0, LW/g;->q:Ljava/lang/Object;

    .line 29
    .line 30
    if-eqz p1, :cond_4

    .line 31
    .line 32
    iget-object v0, p0, LW/g;->r:LW/f;

    .line 33
    .line 34
    if-nez v0, :cond_3

    .line 35
    .line 36
    new-instance v0, LW/f;

    .line 37
    .line 38
    invoke-direct {v0, p0}, LW/f;-><init>(LW/g;)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, LW/g;->r:LW/f;

    .line 42
    .line 43
    :cond_3
    invoke-interface {p1}, Landroidx/lifecycle/w;->x()LD/n;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iget-object v0, p0, LW/g;->r:LW/f;

    .line 48
    .line 49
    invoke-virtual {p1, v0}, LD/n;->V(Landroidx/lifecycle/v;)V

    .line 50
    .line 51
    .line 52
    :cond_4
    iget-object p1, p0, LW/g;->j:[LW/h;

    .line 53
    .line 54
    array-length v0, p1

    .line 55
    const/4 v1, 0x0

    .line 56
    :goto_0
    if-ge v1, v0, :cond_5

    .line 57
    .line 58
    aget-object v2, p1, v1

    .line 59
    .line 60
    add-int/lit8 v1, v1, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_5
    :goto_1
    return-void
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

.method public final j0(Landroid/view/View;)V
    .locals 1

    .line 1
    const v0, 0x7f0a00fd

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    return-void
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
