.class public final Lb5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:J

.field public final synthetic d:Lb5/z;


# direct methods
.method public synthetic constructor <init>(Lb5/z;Ljava/lang/String;JI)V
    .locals 0

    .line 1
    iput p5, p0, Lb5/a;->a:I

    iput-object p2, p0, Lb5/a;->b:Ljava/lang/String;

    iput-wide p3, p0, Lb5/a;->c:J

    iput-object p1, p0, Lb5/a;->d:Lb5/z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget v0, p0, Lb5/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb5/a;->d:Lb5/z;

    .line 7
    .line 8
    invoke-virtual {v0}, Lb5/A;->l0()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lb5/a;->b:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v1}, LF4/y;->e(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v2, v0, Lb5/z;->c:Ls/e;

    .line 17
    .line 18
    invoke-virtual {v2, v1}, Ls/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    check-cast v3, Ljava/lang/Integer;

    .line 23
    .line 24
    iget-object v4, v0, LD/n;->a:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v4, Lb5/n0;

    .line 27
    .line 28
    if-eqz v3, :cond_3

    .line 29
    .line 30
    iget-object v5, v4, Lb5/n0;->o:Lb5/d1;

    .line 31
    .line 32
    invoke-static {v5}, Lb5/n0;->e(Lb5/B;)V

    .line 33
    .line 34
    .line 35
    const/4 v6, 0x0

    .line 36
    invoke-virtual {v5, v6}, Lb5/d1;->s0(Z)Lb5/a1;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    add-int/lit8 v3, v3, -0x1

    .line 45
    .line 46
    if-nez v3, :cond_2

    .line 47
    .line 48
    invoke-virtual {v2, v1}, Ls/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    iget-object v3, v0, Lb5/z;->b:Ls/e;

    .line 52
    .line 53
    invoke-virtual {v3, v1}, Ls/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    check-cast v6, Ljava/lang/Long;

    .line 58
    .line 59
    iget-wide v7, p0, Lb5/a;->c:J

    .line 60
    .line 61
    iget-object v4, v4, Lb5/n0;->i:Lb5/V;

    .line 62
    .line 63
    if-nez v6, :cond_0

    .line 64
    .line 65
    invoke-static {v4}, Lb5/n0;->f(Lb5/x0;)V

    .line 66
    .line 67
    .line 68
    const-string v1, "First ad unit exposure time was never set"

    .line 69
    .line 70
    iget-object v3, v4, Lb5/V;->f:Lb5/T;

    .line 71
    .line 72
    invoke-virtual {v3, v1}, Lb5/T;->b(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 77
    .line 78
    .line 79
    move-result-wide v9

    .line 80
    sub-long v9, v7, v9

    .line 81
    .line 82
    invoke-virtual {v3, v1}, Ls/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v1, v9, v10, v5}, Lb5/z;->q0(Ljava/lang/String;JLb5/a1;)V

    .line 86
    .line 87
    .line 88
    :goto_0
    invoke-virtual {v2}, Ls/i;->isEmpty()Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_4

    .line 93
    .line 94
    iget-wide v1, v0, Lb5/z;->d:J

    .line 95
    .line 96
    const-wide/16 v9, 0x0

    .line 97
    .line 98
    cmp-long v3, v1, v9

    .line 99
    .line 100
    if-nez v3, :cond_1

    .line 101
    .line 102
    invoke-static {v4}, Lb5/n0;->f(Lb5/x0;)V

    .line 103
    .line 104
    .line 105
    const-string v0, "First ad exposure time was never set"

    .line 106
    .line 107
    iget-object v1, v4, Lb5/V;->f:Lb5/T;

    .line 108
    .line 109
    invoke-virtual {v1, v0}, Lb5/T;->b(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_1
    sub-long/2addr v7, v1

    .line 114
    invoke-virtual {v0, v7, v8, v5}, Lb5/z;->p0(JLb5/a1;)V

    .line 115
    .line 116
    .line 117
    iput-wide v9, v0, Lb5/z;->d:J

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-virtual {v2, v1, v0}, Ls/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_3
    iget-object v0, v4, Lb5/n0;->i:Lb5/V;

    .line 129
    .line 130
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 131
    .line 132
    .line 133
    const-string v2, "Call to endAdUnitExposure for unknown ad unit id"

    .line 134
    .line 135
    iget-object v0, v0, Lb5/V;->f:Lb5/T;

    .line 136
    .line 137
    invoke-virtual {v0, v1, v2}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    :cond_4
    :goto_1
    return-void

    .line 141
    :pswitch_0
    iget-object v0, p0, Lb5/a;->d:Lb5/z;

    .line 142
    .line 143
    invoke-virtual {v0}, Lb5/A;->l0()V

    .line 144
    .line 145
    .line 146
    iget-object v1, p0, Lb5/a;->b:Ljava/lang/String;

    .line 147
    .line 148
    invoke-static {v1}, LF4/y;->e(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    iget-object v2, v0, Lb5/z;->c:Ls/e;

    .line 152
    .line 153
    invoke-virtual {v2}, Ls/i;->isEmpty()Z

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    iget-wide v4, p0, Lb5/a;->c:J

    .line 158
    .line 159
    if-eqz v3, :cond_5

    .line 160
    .line 161
    iput-wide v4, v0, Lb5/z;->d:J

    .line 162
    .line 163
    :cond_5
    invoke-virtual {v2, v1}, Ls/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    check-cast v3, Ljava/lang/Integer;

    .line 168
    .line 169
    const/4 v6, 0x1

    .line 170
    if-eqz v3, :cond_6

    .line 171
    .line 172
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    add-int/2addr v0, v6

    .line 177
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-virtual {v2, v1, v0}, Ls/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_6
    iget v3, v2, Ls/i;->c:I

    .line 186
    .line 187
    const/16 v7, 0x64

    .line 188
    .line 189
    if-lt v3, v7, :cond_7

    .line 190
    .line 191
    iget-object v0, v0, LD/n;->a:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v0, Lb5/n0;

    .line 194
    .line 195
    iget-object v0, v0, Lb5/n0;->i:Lb5/V;

    .line 196
    .line 197
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 198
    .line 199
    .line 200
    const-string v1, "Too many ads visible"

    .line 201
    .line 202
    iget-object v0, v0, Lb5/V;->i:Lb5/T;

    .line 203
    .line 204
    invoke-virtual {v0, v1}, Lb5/T;->b(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    goto :goto_2

    .line 208
    :cond_7
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    invoke-virtual {v2, v1, v3}, Ls/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    iget-object v0, v0, Lb5/z;->b:Ls/e;

    .line 220
    .line 221
    invoke-virtual {v0, v1, v2}, Ls/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    :goto_2
    return-void

    .line 225
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
