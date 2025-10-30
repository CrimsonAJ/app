.class public final synthetic LP1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LP1/b;

.field public final synthetic c:LH2/c;


# direct methods
.method public synthetic constructor <init>(LH2/c;LP1/b;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, LP1/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LP1/a;->c:LH2/c;

    iput-object p2, p0, LP1/a;->b:LP1/b;

    return-void
.end method

.method public synthetic constructor <init>(LP1/b;LH2/c;I)V
    .locals 0

    .line 2
    iput p3, p0, LP1/a;->a:I

    iput-object p1, p0, LP1/a;->b:LP1/b;

    iput-object p2, p0, LP1/a;->c:LH2/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget p1, p0, LP1/a;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LP1/a;->b:LP1/b;

    .line 7
    .line 8
    iget-object p1, p1, LP1/b;->v:Lcom/anilab/android/ui/comment/CommentListFragment;

    .line 9
    .line 10
    iget-object v0, p0, LP1/a;->c:LH2/c;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Lcom/anilab/android/ui/comment/CommentListFragment;->w0(LH2/c;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object p1, p0, LP1/a;->b:LP1/b;

    .line 17
    .line 18
    iget-object p1, p1, LP1/b;->v:Lcom/anilab/android/ui/comment/CommentListFragment;

    .line 19
    .line 20
    iget-object v0, p0, LP1/a;->c:LH2/c;

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Lcom/anilab/android/ui/comment/CommentListFragment;->w0(LH2/c;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    iget-object p1, p0, LP1/a;->b:LP1/b;

    .line 27
    .line 28
    iget-object p1, p1, LP1/b;->v:Lcom/anilab/android/ui/comment/CommentListFragment;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, LP1/a;->c:LH2/c;

    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/anilab/android/ui/comment/CommentListFragment;->s0()LP1/G;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget-object v0, v0, LH2/c;->a:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    new-instance v1, LP1/C;

    .line 45
    .line 46
    const/4 v2, 0x0

    .line 47
    invoke-direct {v1, p1, v0, v2, v2}, LP1/C;-><init>(LP1/G;Ljava/lang/String;Ljava/lang/String;LE7/d;)V

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x1

    .line 51
    invoke-virtual {p1, v0, v1}, LM1/r;->d(ZLO7/p;)LY7/y0;

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_2
    iget-object p1, p0, LP1/a;->b:LP1/b;

    .line 56
    .line 57
    iget-object p1, p1, LP1/b;->v:Lcom/anilab/android/ui/comment/CommentListFragment;

    .line 58
    .line 59
    iget-object v0, p0, LP1/a;->c:LH2/c;

    .line 60
    .line 61
    invoke-virtual {p1, v0}, Lcom/anilab/android/ui/comment/CommentListFragment;->v0(LH2/c;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_3
    iget-object p1, p0, LP1/a;->c:LH2/c;

    .line 66
    .line 67
    iget-object v0, p1, LH2/c;->j:Ljava/lang/Boolean;

    .line 68
    .line 69
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 70
    .line 71
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    iget-object v1, p0, LP1/a;->b:LP1/b;

    .line 76
    .line 77
    if-eqz v0, :cond_0

    .line 78
    .line 79
    iget-object v0, v1, LP1/b;->v:Lcom/anilab/android/ui/comment/CommentListFragment;

    .line 80
    .line 81
    invoke-virtual {v0, p1}, Lcom/anilab/android/ui/comment/CommentListFragment;->x0(LH2/c;)V

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_0
    iget-object v0, v1, LP1/b;->v:Lcom/anilab/android/ui/comment/CommentListFragment;

    .line 86
    .line 87
    invoke-virtual {v0, p1}, Lcom/anilab/android/ui/comment/CommentListFragment;->u0(LH2/c;)V

    .line 88
    .line 89
    .line 90
    :goto_0
    return-void

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method
