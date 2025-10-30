.class public final synthetic Li/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP/j;


# instance fields
.field public final synthetic a:Li/y;


# direct methods
.method public synthetic constructor <init>(Li/y;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li/x;->a:Li/y;

    return-void
.end method


# virtual methods
.method public final h(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Li/x;->a:Li/y;

    invoke-virtual {v0, p1}, Li/y;->e(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
