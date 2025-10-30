.class public final Lco/notix/uk;
.super LG7/j;
.source "SourceFile"

# interfaces
.implements LO7/p;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Lco/notix/vk;


# direct methods
.method public constructor <init>(Lco/notix/vk;LE7/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/notix/uk;->j:Lco/notix/vk;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, LG7/j;-><init>(ILE7/d;)V

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
.method public final create(Ljava/lang/Object;LE7/d;)LE7/d;
    .locals 2

    .line 1
    new-instance v0, Lco/notix/uk;

    .line 2
    .line 3
    iget-object v1, p0, Lco/notix/uk;->j:Lco/notix/vk;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lco/notix/uk;-><init>(Lco/notix/vk;LE7/d;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lco/notix/uk;->i:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
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
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY7/z;

    .line 2
    .line 3
    check-cast p2, LE7/d;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lco/notix/uk;->create(Ljava/lang/Object;LE7/d;)LE7/d;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lco/notix/uk;

    .line 10
    .line 11
    sget-object p2, LA7/n;->a:LA7/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lco/notix/uk;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
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
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-class v0, Lco/notix/pj;

    .line 4
    .line 5
    const-string v2, "ToJsonAdapter for class "

    .line 6
    .line 7
    sget-object v3, LF7/a;->a:LF7/a;

    .line 8
    .line 9
    iget v4, v1, Lco/notix/uk;->h:I

    .line 10
    .line 11
    const/4 v5, 0x3

    .line 12
    const/4 v6, 0x2

    .line 13
    const/4 v7, 0x1

    .line 14
    const/4 v8, 0x0

    .line 15
    if-eqz v4, :cond_3

    .line 16
    .line 17
    if-eq v4, v7, :cond_2

    .line 18
    .line 19
    if-eq v4, v6, :cond_1

    .line 20
    .line 21
    if-ne v4, v5, :cond_0

    .line 22
    .line 23
    iget-object v0, v1, Lco/notix/uk;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lco/notix/we;

    .line 26
    .line 27
    iget-object v2, v1, Lco/notix/uk;->a:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v2, Lco/notix/vk;

    .line 30
    .line 31
    iget-object v3, v1, Lco/notix/uk;->i:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static/range {p1 .. p1}, La/a;->A(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto/16 :goto_6

    .line 37
    .line 38
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v0

    .line 46
    :cond_1
    :try_start_0
    invoke-static/range {p1 .. p1}, La/a;->A(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    move-object/from16 v0, p1

    .line 50
    .line 51
    goto/16 :goto_2

    .line 52
    .line 53
    :catchall_0
    move-exception v0

    .line 54
    goto/16 :goto_3

    .line 55
    .line 56
    :cond_2
    iget-object v4, v1, Lco/notix/uk;->g:Ljava/lang/String;

    .line 57
    .line 58
    iget-object v7, v1, Lco/notix/uk;->f:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v9, v1, Lco/notix/uk;->e:Ljava/lang/String;

    .line 61
    .line 62
    iget-object v10, v1, Lco/notix/uk;->d:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v11, v1, Lco/notix/uk;->c:Ljava/lang/String;

    .line 65
    .line 66
    iget-object v12, v1, Lco/notix/uk;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v12, Ljava/lang/String;

    .line 69
    .line 70
    iget-object v13, v1, Lco/notix/uk;->a:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v13, Ljava/lang/String;

    .line 73
    .line 74
    iget-object v14, v1, Lco/notix/uk;->i:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v14, Lco/notix/vk;

    .line 77
    .line 78
    :try_start_1
    invoke-static/range {p1 .. p1}, La/a;->A(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 79
    .line 80
    .line 81
    move-object/from16 v5, p1

    .line 82
    .line 83
    move-object/from16 v19, v7

    .line 84
    .line 85
    move-object/from16 v20, v9

    .line 86
    .line 87
    move-object/from16 v21, v10

    .line 88
    .line 89
    move-object/from16 v22, v11

    .line 90
    .line 91
    move-object/from16 v23, v12

    .line 92
    .line 93
    move-object/from16 v24, v13

    .line 94
    .line 95
    :goto_0
    move-object/from16 v18, v4

    .line 96
    .line 97
    goto/16 :goto_1

    .line 98
    .line 99
    :cond_3
    invoke-static/range {p1 .. p1}, La/a;->A(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    iget-object v4, v1, Lco/notix/uk;->i:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v4, LY7/z;

    .line 105
    .line 106
    iget-object v14, v1, Lco/notix/uk;->j:Lco/notix/vk;

    .line 107
    .line 108
    :try_start_2
    iget-object v4, v14, Lco/notix/vk;->b:Lco/notix/xq;

    .line 109
    .line 110
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    new-instance v15, Lco/notix/domain/RequestVars;

    .line 114
    .line 115
    sget-object v4, Lco/notix/wq;->b:Lco/notix/d9;

    .line 116
    .line 117
    invoke-virtual {v4}, Lco/notix/d9;->a()Landroid/content/Context;

    .line 118
    .line 119
    .line 120
    move-result-object v9

    .line 121
    const-string v10, "NOTIX_SUBSCRIBE_REQUEST_VAR_1"

    .line 122
    .line 123
    invoke-static {v9, v10}, Lco/notix/xq;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v16

    .line 127
    invoke-virtual {v4}, Lco/notix/d9;->a()Landroid/content/Context;

    .line 128
    .line 129
    .line 130
    move-result-object v9

    .line 131
    const-string v10, "NOTIX_SUBSCRIBE_REQUEST_VAR_2"

    .line 132
    .line 133
    invoke-static {v9, v10}, Lco/notix/xq;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v17

    .line 137
    invoke-virtual {v4}, Lco/notix/d9;->a()Landroid/content/Context;

    .line 138
    .line 139
    .line 140
    move-result-object v9

    .line 141
    const-string v10, "NOTIX_SUBSCRIBE_REQUEST_VAR_3"

    .line 142
    .line 143
    invoke-static {v9, v10}, Lco/notix/xq;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v18

    .line 147
    invoke-virtual {v4}, Lco/notix/d9;->a()Landroid/content/Context;

    .line 148
    .line 149
    .line 150
    move-result-object v9

    .line 151
    const-string v10, "NOTIX_SUBSCRIBE_REQUEST_VAR_4"

    .line 152
    .line 153
    invoke-static {v9, v10}, Lco/notix/xq;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v19

    .line 157
    invoke-virtual {v4}, Lco/notix/d9;->a()Landroid/content/Context;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    const-string v9, "NOTIX_SUBSCRIBE_REQUEST_VAR_5"

    .line 162
    .line 163
    invoke-static {v4, v9}, Lco/notix/xq;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v20

    .line 167
    invoke-direct/range {v15 .. v20}, Lco/notix/domain/RequestVars;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    iget-object v4, v14, Lco/notix/vk;->b:Lco/notix/xq;

    .line 171
    .line 172
    invoke-virtual {v4}, Lco/notix/xq;->c()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    iget-object v9, v14, Lco/notix/vk;->b:Lco/notix/xq;

    .line 177
    .line 178
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    invoke-static {}, Lco/notix/xq;->a()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v9

    .line 185
    if-eqz v9, :cond_7

    .line 186
    .line 187
    invoke-virtual {v15}, Lco/notix/domain/RequestVars;->getVar1()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v10

    .line 191
    invoke-virtual {v15}, Lco/notix/domain/RequestVars;->getVar2()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v11

    .line 195
    invoke-virtual {v15}, Lco/notix/domain/RequestVars;->getVar3()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v12

    .line 199
    invoke-virtual {v15}, Lco/notix/domain/RequestVars;->getVar4()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v13

    .line 203
    invoke-virtual {v15}, Lco/notix/domain/RequestVars;->getVar5()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v15

    .line 207
    iget-object v5, v14, Lco/notix/vk;->e:Lco/notix/l2;

    .line 208
    .line 209
    iput-object v14, v1, Lco/notix/uk;->i:Ljava/lang/Object;

    .line 210
    .line 211
    iput-object v15, v1, Lco/notix/uk;->a:Ljava/lang/Object;

    .line 212
    .line 213
    iput-object v13, v1, Lco/notix/uk;->b:Ljava/lang/Object;

    .line 214
    .line 215
    iput-object v12, v1, Lco/notix/uk;->c:Ljava/lang/String;

    .line 216
    .line 217
    iput-object v11, v1, Lco/notix/uk;->d:Ljava/lang/String;

    .line 218
    .line 219
    iput-object v10, v1, Lco/notix/uk;->e:Ljava/lang/String;

    .line 220
    .line 221
    iput-object v9, v1, Lco/notix/uk;->f:Ljava/lang/String;

    .line 222
    .line 223
    iput-object v4, v1, Lco/notix/uk;->g:Ljava/lang/String;

    .line 224
    .line 225
    iput v7, v1, Lco/notix/uk;->h:I

    .line 226
    .line 227
    invoke-virtual {v5, v1}, Lco/notix/l2;->a(LE7/d;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v5

    .line 231
    if-ne v5, v3, :cond_4

    .line 232
    .line 233
    goto/16 :goto_5

    .line 234
    .line 235
    :cond_4
    move-object/from16 v19, v9

    .line 236
    .line 237
    move-object/from16 v20, v10

    .line 238
    .line 239
    move-object/from16 v21, v11

    .line 240
    .line 241
    move-object/from16 v22, v12

    .line 242
    .line 243
    move-object/from16 v23, v13

    .line 244
    .line 245
    move-object/from16 v24, v15

    .line 246
    .line 247
    goto/16 :goto_0

    .line 248
    .line 249
    :goto_1
    move-object/from16 v25, v5

    .line 250
    .line 251
    check-cast v25, Lco/notix/o;

    .line 252
    .line 253
    new-instance v17, Lco/notix/pj;

    .line 254
    .line 255
    invoke-direct/range {v17 .. v25}, Lco/notix/pj;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/notix/o;)V

    .line 256
    .line 257
    .line 258
    move-object/from16 v4, v17

    .line 259
    .line 260
    iget-object v5, v14, Lco/notix/vk;->c:Lco/notix/ic;

    .line 261
    .line 262
    iget-object v5, v5, Lco/notix/ic;->a:Ljava/util/LinkedHashMap;

    .line 263
    .line 264
    invoke-virtual {v5, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v5

    .line 268
    check-cast v5, Lco/notix/gr;

    .line 269
    .line 270
    if-eqz v5, :cond_6

    .line 271
    .line 272
    invoke-interface {v5, v4}, Lco/notix/td;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    iget-object v2, v14, Lco/notix/vk;->d:Lco/notix/wj;

    .line 281
    .line 282
    iput-object v8, v1, Lco/notix/uk;->i:Ljava/lang/Object;

    .line 283
    .line 284
    iput-object v8, v1, Lco/notix/uk;->a:Ljava/lang/Object;

    .line 285
    .line 286
    iput-object v8, v1, Lco/notix/uk;->b:Ljava/lang/Object;

    .line 287
    .line 288
    iput-object v8, v1, Lco/notix/uk;->c:Ljava/lang/String;

    .line 289
    .line 290
    iput-object v8, v1, Lco/notix/uk;->d:Ljava/lang/String;

    .line 291
    .line 292
    iput-object v8, v1, Lco/notix/uk;->e:Ljava/lang/String;

    .line 293
    .line 294
    iput-object v8, v1, Lco/notix/uk;->f:Ljava/lang/String;

    .line 295
    .line 296
    iput-object v8, v1, Lco/notix/uk;->g:Ljava/lang/String;

    .line 297
    .line 298
    iput v6, v1, Lco/notix/uk;->h:I

    .line 299
    .line 300
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    sget-object v4, LY7/K;->b:Lf8/d;

    .line 304
    .line 305
    new-instance v5, Lco/notix/vj;

    .line 306
    .line 307
    invoke-direct {v5, v2, v0, v8}, Lco/notix/vj;-><init>(Lco/notix/wj;Ljava/lang/String;LE7/d;)V

    .line 308
    .line 309
    .line 310
    invoke-static {v4, v5, v1}, LY7/B;->C(LE7/i;LO7/p;LE7/d;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    if-ne v0, v3, :cond_5

    .line 315
    .line 316
    goto :goto_5

    .line 317
    :cond_5
    :goto_2
    check-cast v0, Lco/notix/we;

    .line 318
    .line 319
    goto :goto_4

    .line 320
    :cond_6
    new-instance v4, Ljava/lang/NullPointerException;

    .line 321
    .line 322
    new-instance v5, Ljava/lang/StringBuilder;

    .line 323
    .line 324
    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    const-string v0, " not found"

    .line 331
    .line 332
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    invoke-direct {v4, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    throw v4

    .line 343
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 344
    .line 345
    const-string v2, "no app id"

    .line 346
    .line 347
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 351
    :goto_3
    invoke-static {v0}, La/a;->h(Ljava/lang/Throwable;)LA7/i;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    :goto_4
    iget-object v2, v1, Lco/notix/uk;->j:Lco/notix/vk;

    .line 356
    .line 357
    instance-of v4, v0, LA7/i;

    .line 358
    .line 359
    if-nez v4, :cond_9

    .line 360
    .line 361
    move-object v4, v0

    .line 362
    check-cast v4, Lco/notix/we;

    .line 363
    .line 364
    sget-object v5, Lco/notix/md;->a:Lco/notix/kd;

    .line 365
    .line 366
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 367
    .line 368
    .line 369
    iget-object v5, v5, Lco/notix/kd;->b:Lco/notix/x8;

    .line 370
    .line 371
    const-string v6, "getPullData success"

    .line 372
    .line 373
    invoke-virtual {v5, v6}, Lco/notix/x8;->b(Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    iget-object v5, v2, Lco/notix/vk;->e:Lco/notix/l2;

    .line 377
    .line 378
    iput-object v0, v1, Lco/notix/uk;->i:Ljava/lang/Object;

    .line 379
    .line 380
    iput-object v2, v1, Lco/notix/uk;->a:Ljava/lang/Object;

    .line 381
    .line 382
    iput-object v4, v1, Lco/notix/uk;->b:Ljava/lang/Object;

    .line 383
    .line 384
    iput-object v8, v1, Lco/notix/uk;->c:Ljava/lang/String;

    .line 385
    .line 386
    iput-object v8, v1, Lco/notix/uk;->d:Ljava/lang/String;

    .line 387
    .line 388
    iput-object v8, v1, Lco/notix/uk;->e:Ljava/lang/String;

    .line 389
    .line 390
    iput-object v8, v1, Lco/notix/uk;->f:Ljava/lang/String;

    .line 391
    .line 392
    iput-object v8, v1, Lco/notix/uk;->g:Ljava/lang/String;

    .line 393
    .line 394
    const/4 v6, 0x3

    .line 395
    iput v6, v1, Lco/notix/uk;->h:I

    .line 396
    .line 397
    invoke-virtual {v5, v1}, Lco/notix/l2;->e(LE7/d;)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v5

    .line 401
    if-ne v5, v3, :cond_8

    .line 402
    .line 403
    :goto_5
    return-object v3

    .line 404
    :cond_8
    move-object v3, v0

    .line 405
    move-object v0, v4

    .line 406
    :goto_6
    iget-object v2, v2, Lco/notix/vk;->f:Lco/notix/og;

    .line 407
    .line 408
    new-instance v4, Lco/notix/callback/NotixCallback$PushDataLoad;

    .line 409
    .line 410
    sget-object v5, Lco/notix/callback/NotixCallbackStatus;->SUCCESS:Lco/notix/callback/NotixCallbackStatus;

    .line 411
    .line 412
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    invoke-direct {v4, v5, v0}, Lco/notix/callback/NotixCallback$PushDataLoad;-><init>(Lco/notix/callback/NotixCallbackStatus;Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v2, v4}, Lco/notix/og;->a(Lco/notix/callback/NotixCallback;)V

    .line 420
    .line 421
    .line 422
    move-object v0, v3

    .line 423
    :cond_9
    iget-object v2, v1, Lco/notix/uk;->j:Lco/notix/vk;

    .line 424
    .line 425
    invoke-static {v0}, LA7/j;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 426
    .line 427
    .line 428
    move-result-object v3

    .line 429
    if-eqz v3, :cond_a

    .line 430
    .line 431
    sget-object v4, Lco/notix/md;->a:Lco/notix/kd;

    .line 432
    .line 433
    const-string v5, "getPullData failure"

    .line 434
    .line 435
    invoke-static {v4, v5, v3}, Lco/notix/yn;->a(Lco/notix/kd;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 436
    .line 437
    .line 438
    iget-object v2, v2, Lco/notix/vk;->f:Lco/notix/og;

    .line 439
    .line 440
    new-instance v4, Lco/notix/callback/NotixCallback$PushDataLoad;

    .line 441
    .line 442
    sget-object v5, Lco/notix/callback/NotixCallbackStatus;->FAILURE:Lco/notix/callback/NotixCallbackStatus;

    .line 443
    .line 444
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v3

    .line 448
    invoke-direct {v4, v5, v3}, Lco/notix/callback/NotixCallback$PushDataLoad;-><init>(Lco/notix/callback/NotixCallbackStatus;Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v2, v4}, Lco/notix/og;->a(Lco/notix/callback/NotixCallback;)V

    .line 452
    .line 453
    .line 454
    :cond_a
    new-instance v2, LA7/j;

    .line 455
    .line 456
    invoke-direct {v2, v0}, LA7/j;-><init>(Ljava/lang/Object;)V

    .line 457
    .line 458
    .line 459
    return-object v2
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
