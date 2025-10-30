.class public final synthetic Ll2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO7/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/anilab/android/ui/search/SearchFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/anilab/android/ui/search/SearchFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Ll2/c;->a:I

    iput-object p1, p0, Ll2/c;->b:Lcom/anilab/android/ui/search/SearchFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Ll2/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ll2/c;->b:Lcom/anilab/android/ui/search/SearchFragment;

    .line 7
    .line 8
    invoke-virtual {v0}, LM1/n;->e0()LW/g;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, LJ1/u0;

    .line 13
    .line 14
    iget-object v1, v1, LJ1/u0;->B:Landroidx/recyclerview/widget/RecyclerView;

    .line 15
    .line 16
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/a;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    new-instance v2, Ll2/d;

    .line 21
    .line 22
    invoke-direct {v2, v0, v1}, Ll2/d;-><init>(Lcom/anilab/android/ui/search/SearchFragment;Landroidx/recyclerview/widget/a;)V

    .line 23
    .line 24
    .line 25
    return-object v2

    .line 26
    :pswitch_0
    new-instance v0, Ll2/b;

    .line 27
    .line 28
    new-instance v1, LG0/h;

    .line 29
    .line 30
    iget-object v3, p0, Ll2/c;->b:Lcom/anilab/android/ui/search/SearchFragment;

    .line 31
    .line 32
    const-class v4, Lcom/anilab/android/ui/search/SearchFragment;

    .line 33
    .line 34
    const-string v5, "onMovieClick"

    .line 35
    .line 36
    const/4 v2, 0x1

    .line 37
    const-string v6, "onMovieClick(Lcom/anilab/domain/model/Movie;)V"

    .line 38
    .line 39
    const/4 v7, 0x0

    .line 40
    const/16 v8, 0x8

    .line 41
    .line 42
    invoke-direct/range {v1 .. v8}, LG0/h;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 43
    .line 44
    .line 45
    invoke-direct {v0, v1}, Ll2/b;-><init>(LG0/h;)V

    .line 46
    .line 47
    .line 48
    return-object v0

    .line 49
    :pswitch_1
    new-instance v0, Ll2/o;

    .line 50
    .line 51
    new-instance v1, LG0/h;

    .line 52
    .line 53
    iget-object v3, p0, Ll2/c;->b:Lcom/anilab/android/ui/search/SearchFragment;

    .line 54
    .line 55
    const-class v4, Lcom/anilab/android/ui/search/SearchFragment;

    .line 56
    .line 57
    const-string v5, "onMovieClick"

    .line 58
    .line 59
    const/4 v2, 0x1

    .line 60
    const-string v6, "onMovieClick(Lcom/anilab/domain/model/Movie;)V"

    .line 61
    .line 62
    const/4 v7, 0x0

    .line 63
    const/16 v8, 0x9

    .line 64
    .line 65
    invoke-direct/range {v1 .. v8}, LG0/h;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 66
    .line 67
    .line 68
    invoke-direct {v0, v1}, Ll2/o;-><init>(LG0/h;)V

    .line 69
    .line 70
    .line 71
    return-object v0

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
