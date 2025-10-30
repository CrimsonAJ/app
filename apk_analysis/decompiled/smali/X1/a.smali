.class public final synthetic LX1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LX1/b;

.field public final synthetic c:LH2/g;


# direct methods
.method public synthetic constructor <init>(LX1/b;LH2/g;I)V
    .locals 0

    .line 1
    iput p3, p0, LX1/a;->a:I

    iput-object p1, p0, LX1/a;->b:LX1/b;

    iput-object p2, p0, LX1/a;->c:LH2/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget p1, p0, LX1/a;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LX1/a;->b:LX1/b;

    .line 7
    .line 8
    iget-object p1, p1, LX1/b;->w:LX1/C;

    .line 9
    .line 10
    iget-object v0, p0, LX1/a;->c:LH2/g;

    .line 11
    .line 12
    iget-object v0, v0, LH2/g;->i:Lcom/anilab/domain/model/Movie;

    .line 13
    .line 14
    invoke-virtual {p1, v0}, LX1/C;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object p1, p0, LX1/a;->b:LX1/b;

    .line 19
    .line 20
    iget-object p1, p1, LX1/b;->v:LX1/B;

    .line 21
    .line 22
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 23
    .line 24
    iget-object v1, p0, LX1/a;->c:LH2/g;

    .line 25
    .line 26
    invoke-virtual {p1, v1, v0, v0}, LX1/B;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method
