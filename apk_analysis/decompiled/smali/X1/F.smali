.class public final LX1/F;
.super LF0/S;
.source "SourceFile"


# instance fields
.field public final d:Lcom/anilab/android/ui/home/HomeFragment;

.field public final e:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lcom/anilab/android/ui/home/HomeFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LF0/S;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LX1/F;->d:Lcom/anilab/android/ui/home/HomeFragment;

    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, LX1/F;->e:Ljava/util/ArrayList;

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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget-object v0, p0, LX1/F;->e:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public final c(I)I
    .locals 1

    .line 1
    iget-object v0, p0, LX1/F;->e:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {v0, p1}, LB7/k;->r0(Ljava/util/List;I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    instance-of p1, p1, LH2/k;

    .line 8
    .line 9
    xor-int/lit8 p1, p1, 0x1

    .line 10
    .line 11
    return p1
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

.method public final g(LF0/r0;I)V
    .locals 5

    .line 1
    iget-object v0, p0, LX1/F;->e:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {v0, p2}, LB7/k;->r0(Ljava/util/List;I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, LH2/n;

    .line 8
    .line 9
    instance-of v0, p1, LX1/E;

    .line 10
    .line 11
    const-string v1, "buttonSeeAll"

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    const-string v3, "item"

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    instance-of v0, p2, LH2/l;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    check-cast p1, LX1/E;

    .line 23
    .line 24
    check-cast p2, LH2/l;

    .line 25
    .line 26
    invoke-static {p2, v3}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p1, LX1/E;->u:LJ1/Z0;

    .line 30
    .line 31
    iget-object v3, v0, LJ1/Z0;->w:Landroidx/appcompat/widget/AppCompatTextView;

    .line 32
    .line 33
    iget-object v4, p2, LH2/l;->a:Lcom/anilab/domain/model/Shortcut;

    .line 34
    .line 35
    iget-object v4, v4, Lcom/anilab/domain/model/Shortcut;->b:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 38
    .line 39
    .line 40
    iget-object v3, v0, LJ1/Z0;->x:Landroidx/recyclerview/widget/RecyclerView;

    .line 41
    .line 42
    invoke-virtual {v3, v2}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 43
    .line 44
    .line 45
    iget-object v2, p1, LX1/E;->v:LA7/l;

    .line 46
    .line 47
    invoke-virtual {v2}, LA7/l;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, LX1/r;

    .line 52
    .line 53
    invoke-virtual {v3, v4}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(LF0/S;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2}, LA7/l;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, LX1/r;

    .line 61
    .line 62
    new-instance v3, LX1/z;

    .line 63
    .line 64
    const/4 v4, 0x1

    .line 65
    invoke-direct {v3, v0, v4}, LX1/z;-><init>(LJ1/Z0;I)V

    .line 66
    .line 67
    .line 68
    iget-object v2, v2, LF0/I;->d:LF0/f;

    .line 69
    .line 70
    iget-object v4, p2, LH2/l;->b:Ljava/util/List;

    .line 71
    .line 72
    invoke-virtual {v2, v4, v3}, LF0/f;->b(Ljava/util/List;Ljava/lang/Runnable;)V

    .line 73
    .line 74
    .line 75
    iget-object v0, v0, LJ1/Z0;->v:Landroidx/appcompat/widget/AppCompatTextView;

    .line 76
    .line 77
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const/4 v1, 0x0

    .line 81
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 82
    .line 83
    .line 84
    new-instance v1, LI5/k;

    .line 85
    .line 86
    iget-object p1, p1, LX1/E;->w:LX1/F;

    .line 87
    .line 88
    const/16 v2, 0x9

    .line 89
    .line 90
    invoke-direct {v1, p1, v2, p2}, LI5/k;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_0
    instance-of v0, p1, LX1/D;

    .line 98
    .line 99
    if-eqz v0, :cond_1

    .line 100
    .line 101
    instance-of v0, p2, LH2/k;

    .line 102
    .line 103
    if-eqz v0, :cond_1

    .line 104
    .line 105
    check-cast p1, LX1/D;

    .line 106
    .line 107
    check-cast p2, LH2/k;

    .line 108
    .line 109
    invoke-static {p2, v3}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    iget-object v0, p1, LX1/D;->u:LJ1/Z0;

    .line 113
    .line 114
    iget-object v3, v0, LJ1/Z0;->v:Landroidx/appcompat/widget/AppCompatTextView;

    .line 115
    .line 116
    invoke-static {v3, v1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    const/16 v1, 0x8

    .line 120
    .line 121
    invoke-virtual {v3, v1}, Landroid/view/View;->setVisibility(I)V

    .line 122
    .line 123
    .line 124
    iget-object v1, p2, LH2/k;->a:Lcom/anilab/domain/model/Shortcut;

    .line 125
    .line 126
    iget-object v3, v0, LJ1/Z0;->w:Landroidx/appcompat/widget/AppCompatTextView;

    .line 127
    .line 128
    iget-object v1, v1, Lcom/anilab/domain/model/Shortcut;->b:Ljava/lang/String;

    .line 129
    .line 130
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 131
    .line 132
    .line 133
    iget-object v1, v0, LJ1/Z0;->x:Landroidx/recyclerview/widget/RecyclerView;

    .line 134
    .line 135
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 136
    .line 137
    .line 138
    iget-object p1, p1, LX1/D;->v:LA7/l;

    .line 139
    .line 140
    invoke-virtual {p1}, LA7/l;->getValue()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    check-cast v2, LX1/c;

    .line 145
    .line 146
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(LF0/S;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1}, LA7/l;->getValue()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    check-cast p1, LX1/c;

    .line 154
    .line 155
    new-instance v1, LX1/z;

    .line 156
    .line 157
    const/4 v2, 0x0

    .line 158
    invoke-direct {v1, v0, v2}, LX1/z;-><init>(LJ1/Z0;I)V

    .line 159
    .line 160
    .line 161
    iget-object p1, p1, LF0/I;->d:LF0/f;

    .line 162
    .line 163
    iget-object p2, p2, LH2/k;->b:Ljava/util/List;

    .line 164
    .line 165
    invoke-virtual {p1, p2, v1}, LF0/f;->b(Ljava/util/List;Ljava/lang/Runnable;)V

    .line 166
    .line 167
    .line 168
    :cond_1
    return-void
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

.method public final h(Landroid/view/ViewGroup;I)LF0/r0;
    .locals 5

    .line 1
    const-string v0, "parent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const v1, 0x7f0d0075

    .line 8
    .line 9
    .line 10
    const-string v2, "inflate(...)"

    .line 11
    .line 12
    if-nez p2, :cond_0

    .line 13
    .line 14
    new-instance p2, LX1/D;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    sget v4, LJ1/Z0;->y:I

    .line 25
    .line 26
    invoke-static {v3, v1, p1, v0}, LW/c;->b(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)LW/g;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, LJ1/Z0;

    .line 31
    .line 32
    invoke-static {p1, v2}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p2, p0, p1}, LX1/D;-><init>(LX1/F;LJ1/Z0;)V

    .line 36
    .line 37
    .line 38
    return-object p2

    .line 39
    :cond_0
    new-instance p2, LX1/E;

    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    sget v4, LJ1/Z0;->y:I

    .line 50
    .line 51
    invoke-static {v3, v1, p1, v0}, LW/c;->b(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)LW/g;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, LJ1/Z0;

    .line 56
    .line 57
    invoke-static {p1, v2}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-direct {p2, p0, p1}, LX1/E;-><init>(LX1/F;LJ1/Z0;)V

    .line 61
    .line 62
    .line 63
    return-object p2
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
.end method
