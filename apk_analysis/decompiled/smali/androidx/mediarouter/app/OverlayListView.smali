.class final Landroidx/mediarouter/app/OverlayListView;
.super Landroid/widget/ListView;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Landroidx/mediarouter/app/OverlayListView;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    return-void
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
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 9

    .line 1
    invoke-super {p0, p1}, Landroid/widget/ListView;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/mediarouter/app/OverlayListView;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-lez v1, :cond_7

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_7

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Landroidx/mediarouter/app/O;

    .line 27
    .line 28
    iget-object v2, v1, Landroidx/mediarouter/app/O;->a:Landroid/graphics/drawable/BitmapDrawable;

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {v2, p1}, Landroid/graphics/drawable/BitmapDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getDrawingTime()J

    .line 36
    .line 37
    .line 38
    move-result-wide v2

    .line 39
    iget-boolean v4, v1, Landroidx/mediarouter/app/O;->k:Z

    .line 40
    .line 41
    if-eqz v4, :cond_2

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    goto/16 :goto_3

    .line 45
    .line 46
    :cond_2
    iget-wide v4, v1, Landroidx/mediarouter/app/O;->i:J

    .line 47
    .line 48
    sub-long/2addr v2, v4

    .line 49
    long-to-float v2, v2

    .line 50
    iget-wide v3, v1, Landroidx/mediarouter/app/O;->e:J

    .line 51
    .line 52
    long-to-float v3, v3

    .line 53
    div-float/2addr v2, v3

    .line 54
    const/high16 v3, 0x3f800000    # 1.0f

    .line 55
    .line 56
    invoke-static {v3, v2}, Ljava/lang/Math;->min(FF)F

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    const/4 v4, 0x0

    .line 61
    invoke-static {v4, v2}, Ljava/lang/Math;->max(FF)F

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    iget-boolean v5, v1, Landroidx/mediarouter/app/O;->j:Z

    .line 66
    .line 67
    if-nez v5, :cond_3

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    move v4, v2

    .line 71
    :goto_1
    iget-object v2, v1, Landroidx/mediarouter/app/O;->d:Landroid/view/animation/Interpolator;

    .line 72
    .line 73
    if-nez v2, :cond_4

    .line 74
    .line 75
    move v2, v4

    .line 76
    goto :goto_2

    .line 77
    :cond_4
    invoke-interface {v2, v4}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    :goto_2
    iget v5, v1, Landroidx/mediarouter/app/O;->g:I

    .line 82
    .line 83
    int-to-float v5, v5

    .line 84
    mul-float/2addr v5, v2

    .line 85
    float-to-int v5, v5

    .line 86
    iget-object v6, v1, Landroidx/mediarouter/app/O;->f:Landroid/graphics/Rect;

    .line 87
    .line 88
    iget v7, v6, Landroid/graphics/Rect;->top:I

    .line 89
    .line 90
    add-int/2addr v7, v5

    .line 91
    iget-object v8, v1, Landroidx/mediarouter/app/O;->c:Landroid/graphics/Rect;

    .line 92
    .line 93
    iput v7, v8, Landroid/graphics/Rect;->top:I

    .line 94
    .line 95
    iget v6, v6, Landroid/graphics/Rect;->bottom:I

    .line 96
    .line 97
    add-int/2addr v6, v5

    .line 98
    iput v6, v8, Landroid/graphics/Rect;->bottom:I

    .line 99
    .line 100
    iget v5, v1, Landroidx/mediarouter/app/O;->h:F

    .line 101
    .line 102
    invoke-static {v5, v3, v2, v3}, Lu0/z;->b(FFFF)F

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    iput v2, v1, Landroidx/mediarouter/app/O;->b:F

    .line 107
    .line 108
    iget-object v5, v1, Landroidx/mediarouter/app/O;->a:Landroid/graphics/drawable/BitmapDrawable;

    .line 109
    .line 110
    if-eqz v5, :cond_5

    .line 111
    .line 112
    const/high16 v6, 0x437f0000    # 255.0f

    .line 113
    .line 114
    mul-float/2addr v2, v6

    .line 115
    float-to-int v2, v2

    .line 116
    invoke-virtual {v5, v2}, Landroid/graphics/drawable/BitmapDrawable;->setAlpha(I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v5, v8}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 120
    .line 121
    .line 122
    :cond_5
    iget-boolean v2, v1, Landroidx/mediarouter/app/O;->j:Z

    .line 123
    .line 124
    const/4 v5, 0x1

    .line 125
    if-eqz v2, :cond_6

    .line 126
    .line 127
    cmpl-float v2, v4, v3

    .line 128
    .line 129
    if-ltz v2, :cond_6

    .line 130
    .line 131
    iput-boolean v5, v1, Landroidx/mediarouter/app/O;->k:Z

    .line 132
    .line 133
    iget-object v2, v1, Landroidx/mediarouter/app/O;->l:LO0/c;

    .line 134
    .line 135
    if-eqz v2, :cond_6

    .line 136
    .line 137
    iget-object v3, v2, LO0/c;->c:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v3, Landroidx/mediarouter/app/s;

    .line 140
    .line 141
    iget-object v4, v3, Landroidx/mediarouter/app/s;->h0:Ljava/util/HashSet;

    .line 142
    .line 143
    iget-object v2, v2, LO0/c;->b:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v2, Lt0/C;

    .line 146
    .line 147
    invoke-virtual {v4, v2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    iget-object v2, v3, Landroidx/mediarouter/app/s;->Y:Landroidx/mediarouter/app/r;

    .line 151
    .line 152
    invoke-virtual {v2}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 153
    .line 154
    .line 155
    :cond_6
    iget-boolean v1, v1, Landroidx/mediarouter/app/O;->k:Z

    .line 156
    .line 157
    xor-int/2addr v1, v5

    .line 158
    :goto_3
    if-nez v1, :cond_0

    .line 159
    .line 160
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 161
    .line 162
    .line 163
    goto/16 :goto_0

    .line 164
    .line 165
    :cond_7
    return-void
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
