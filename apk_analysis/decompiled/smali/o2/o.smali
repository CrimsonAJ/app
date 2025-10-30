.class public final Lo2/o;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements LO7/a;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LA7/e;I)V
    .locals 0

    .line 1
    iput p2, p0, Lo2/o;->d:I

    iput-object p1, p0, Lo2/o;->e:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/i;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lo2/o;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lo2/o;->e:Ljava/lang/Object;

    .line 7
    .line 8
    invoke-interface {v0}, LA7/e;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Landroidx/lifecycle/k0;

    .line 13
    .line 14
    instance-of v1, v0, Landroidx/lifecycle/k;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    check-cast v0, Landroidx/lifecycle/k;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-interface {v0}, Landroidx/lifecycle/k;->p()Lm0/d;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    sget-object v0, Lm0/a;->b:Lm0/a;

    .line 30
    .line 31
    :goto_1
    return-object v0

    .line 32
    :pswitch_0
    iget-object v0, p0, Lo2/o;->e:Ljava/lang/Object;

    .line 33
    .line 34
    invoke-interface {v0}, LA7/e;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Landroidx/lifecycle/k0;

    .line 39
    .line 40
    invoke-interface {v0}, Landroidx/lifecycle/k0;->u()Landroidx/lifecycle/j0;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    return-object v0

    .line 45
    :pswitch_1
    iget-object v0, p0, Lo2/o;->e:Ljava/lang/Object;

    .line 46
    .line 47
    invoke-interface {v0}, LA7/e;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Landroidx/lifecycle/k0;

    .line 52
    .line 53
    instance-of v1, v0, Landroidx/lifecycle/k;

    .line 54
    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    check-cast v0, Landroidx/lifecycle/k;

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_2
    const/4 v0, 0x0

    .line 61
    :goto_2
    if-eqz v0, :cond_3

    .line 62
    .line 63
    invoke-interface {v0}, Landroidx/lifecycle/k;->p()Lm0/d;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    goto :goto_3

    .line 68
    :cond_3
    sget-object v0, Lm0/a;->b:Lm0/a;

    .line 69
    .line 70
    :goto_3
    return-object v0

    .line 71
    :pswitch_2
    iget-object v0, p0, Lo2/o;->e:Ljava/lang/Object;

    .line 72
    .line 73
    invoke-interface {v0}, LA7/e;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    check-cast v0, Landroidx/lifecycle/k0;

    .line 78
    .line 79
    invoke-interface {v0}, Landroidx/lifecycle/k0;->u()Landroidx/lifecycle/j0;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    return-object v0

    .line 84
    :pswitch_3
    iget-object v0, p0, Lo2/o;->e:Ljava/lang/Object;

    .line 85
    .line 86
    invoke-interface {v0}, LA7/e;->getValue()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    check-cast v0, Landroidx/lifecycle/k0;

    .line 91
    .line 92
    instance-of v1, v0, Landroidx/lifecycle/k;

    .line 93
    .line 94
    if-eqz v1, :cond_4

    .line 95
    .line 96
    check-cast v0, Landroidx/lifecycle/k;

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_4
    const/4 v0, 0x0

    .line 100
    :goto_4
    if-eqz v0, :cond_5

    .line 101
    .line 102
    invoke-interface {v0}, Landroidx/lifecycle/k;->p()Lm0/d;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    goto :goto_5

    .line 107
    :cond_5
    sget-object v0, Lm0/a;->b:Lm0/a;

    .line 108
    .line 109
    :goto_5
    return-object v0

    .line 110
    :pswitch_4
    iget-object v0, p0, Lo2/o;->e:Ljava/lang/Object;

    .line 111
    .line 112
    invoke-interface {v0}, LA7/e;->getValue()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    check-cast v0, Landroidx/lifecycle/k0;

    .line 117
    .line 118
    invoke-interface {v0}, Landroidx/lifecycle/k0;->u()Landroidx/lifecycle/j0;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    return-object v0

    .line 123
    :pswitch_5
    iget-object v0, p0, Lo2/o;->e:Ljava/lang/Object;

    .line 124
    .line 125
    invoke-interface {v0}, LA7/e;->getValue()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    check-cast v0, Landroidx/lifecycle/k0;

    .line 130
    .line 131
    instance-of v1, v0, Landroidx/lifecycle/k;

    .line 132
    .line 133
    if-eqz v1, :cond_6

    .line 134
    .line 135
    check-cast v0, Landroidx/lifecycle/k;

    .line 136
    .line 137
    goto :goto_6

    .line 138
    :cond_6
    const/4 v0, 0x0

    .line 139
    :goto_6
    if-eqz v0, :cond_7

    .line 140
    .line 141
    invoke-interface {v0}, Landroidx/lifecycle/k;->p()Lm0/d;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    goto :goto_7

    .line 146
    :cond_7
    sget-object v0, Lm0/a;->b:Lm0/a;

    .line 147
    .line 148
    :goto_7
    return-object v0

    .line 149
    :pswitch_6
    iget-object v0, p0, Lo2/o;->e:Ljava/lang/Object;

    .line 150
    .line 151
    invoke-interface {v0}, LA7/e;->getValue()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    check-cast v0, Landroidx/lifecycle/k0;

    .line 156
    .line 157
    invoke-interface {v0}, Landroidx/lifecycle/k0;->u()Landroidx/lifecycle/j0;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    return-object v0

    .line 162
    :pswitch_7
    iget-object v0, p0, Lo2/o;->e:Ljava/lang/Object;

    .line 163
    .line 164
    invoke-interface {v0}, LA7/e;->getValue()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    check-cast v0, Landroidx/lifecycle/k0;

    .line 169
    .line 170
    instance-of v1, v0, Landroidx/lifecycle/k;

    .line 171
    .line 172
    if-eqz v1, :cond_8

    .line 173
    .line 174
    check-cast v0, Landroidx/lifecycle/k;

    .line 175
    .line 176
    goto :goto_8

    .line 177
    :cond_8
    const/4 v0, 0x0

    .line 178
    :goto_8
    if-eqz v0, :cond_9

    .line 179
    .line 180
    invoke-interface {v0}, Landroidx/lifecycle/k;->p()Lm0/d;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    goto :goto_9

    .line 185
    :cond_9
    sget-object v0, Lm0/a;->b:Lm0/a;

    .line 186
    .line 187
    :goto_9
    return-object v0

    .line 188
    :pswitch_8
    iget-object v0, p0, Lo2/o;->e:Ljava/lang/Object;

    .line 189
    .line 190
    invoke-interface {v0}, LA7/e;->getValue()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    check-cast v0, Landroidx/lifecycle/k0;

    .line 195
    .line 196
    invoke-interface {v0}, Landroidx/lifecycle/k0;->u()Landroidx/lifecycle/j0;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    return-object v0

    .line 201
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
